package l29_Overloading2;

public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        byte b = 5;
        overloadingExample.method(b);
    }

    void method(int i) {
        System.out.println("int");
    }

    void method(long i) {
        System.out.println("long");
    }

    void method(Integer i) {
        System.out.println("INTEGER");
    }

    void method(double i) {
        System.out.println("double");
    }

    void method(byte... i) {
        System.out.println("byte...");
    }
}
