package l17_AnonClasses;

public class Main {
    public static void main(String[] args) {
//        Computer comp = new Computer();
//        comp.i7.start();
//        comp.transfer.start();
        new Computer(){
          void superComp(){
              this.i7.start();
              this.transfer.start();
          }
        };
    }
}
