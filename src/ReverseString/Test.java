package ReverseString;


public class Test {
    public static void main(String[] args) {
        ReverseS reverseS = new ReverseS();
        ArrayToText arrayToText = new ArrayToText();
        String c = arrayToText.arrayToText();
 StringBuffer buffer = new StringBuffer(c);

        reverseS.reverse1();

        System.out.println(arrayToText.arrayToText());

        buffer.reverse();





    }
}
