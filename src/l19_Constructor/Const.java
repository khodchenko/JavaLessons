package l19_Constructor;

public class Const {
    int i;
    Const(String hello, int i){
        this.i = i;
        System.out.println("run");
    }
}
class Run{
    public static void main(String[] args) {
        Const constr = new Const("hello",3);
        System.out.println(constr.i);
    }
}
