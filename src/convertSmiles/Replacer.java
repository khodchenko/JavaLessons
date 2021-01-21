package convertSmiles;

import convertSmiles.printer.AdvConsolePrinter;
import convertSmiles.printer.ConsolePrinter;
import convertSmiles.printer.IPrinter;
import convertSmiles.readers.IReader;
import convertSmiles.readers.PredefinedReader;

public class Replacer {
 private final IReader reader;
 private final IPrinter printer;

    public Replacer(final IReader reader,final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }
    public void replace(){
        final String text = reader.read();
        final String replaceText = text.replace(":)","=)");
        System.out.print(replaceText);
    }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("fsdf:)dfsfsf:):)fdslfks:)");

        final IPrinter printer = new ConsolePrinter();
        final Replacer replacer = new Replacer(reader,printer);
        final IPrinter advPrinter = new AdvConsolePrinter();
        final Replacer advReplacer = new Replacer(reader,advPrinter);
        advReplacer.replace();
        replacer.replace();

    }
}
