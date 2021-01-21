package l26_Init;

class Parent {
    Parent() {
        System.out.println("parent constructor");
    }
}

public class InitExample extends Parent {
    static int i;
    static {
        i=5;
        System.out.println("static init block");
    }

    {
        System.out.println("init block1");
    }

    {
        System.out.println("init block2");
    }


    InitExample() {
        super();

        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InitExample();
    }
    {
        System.out.println("init block3");
    }
    static {
        System.out.println("static init block 2");
    }
}
