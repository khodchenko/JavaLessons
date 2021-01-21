package l23_Constructors_2;
class Parent{
    Parent(){
        System.out.println("Parent");
    }
}
public class ConstructorExample extends Parent{
    ConstructorExample(int i){
        System.out.println("Constructor EXample");
    }
    ConstructorExample(){
        this(4);
        int j;
    }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}
