package l45_FileExplorer;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\temp.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str\n");
        fileWriter.write("str2\n");
        //fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(file);
        //char [] chars = new char[28];
        //fileReader.read(chars);
        //System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str4");
        bufferedWriter.newLine();
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
