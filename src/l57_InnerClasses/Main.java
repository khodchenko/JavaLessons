package l57_InnerClasses;

public class Main {
    int i = 5;
    Inner inner = new Inner();


    public static void main(String[] args) {
        Main main = new Main();
        //main.method();
        Inner inner = main.new Inner();
        inner.method2();
    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
    }

    class Inner {
        private int k = 6;

        void method2() {
            System.out.println(i);
        }
    }
}
class Second{
    void method(){
        Main.Inner inner = new  Main().new Inner();
        inner.method2();
    }
}
