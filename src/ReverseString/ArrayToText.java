package ReverseString;

public class ArrayToText extends ReverseS {
    String b;

    public String arrayToText() {
        for (int i = 0; i < s.length; i++) {
            String b = "" + s[i] + " ";
            System.out.print(b);

        }
        return b;
    }


}