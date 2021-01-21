package convertSmiles.printer;

public class AdvConsolePrinter implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("String lenght:%d",text.length()));
    }
}
