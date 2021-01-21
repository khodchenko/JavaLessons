package l58_Anonclasses;
class Popcorn {
    void doSomething(){
        System.out.println("popcorn");
    }
    void secondMethod(){
        System.out.println("second");
    }
}
public class AnnonClassesSample{
    public static void main(String[] args) {
    method(new Popcorn(){
        @Override
        void doSomething() {
            System.out.println("bla");
        }
    });
    }
    static void method (Popcorn popcorn){
        popcorn.doSomething();
    }
}
