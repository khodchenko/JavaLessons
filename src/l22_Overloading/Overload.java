package l22_Overloading;

public class Overload {
    int addTwoDigits(int a,int b){
        return  a+b;
    }
    double addTwoDigits(double a, double b){
        return a+b;
    }
    String addTwoDigits(String a){
        return a;
    }
    public static void main(String[] args) {
        Overload overload = new Overload();

        System.out.println(overload.addTwoDigits("suck "));
        System.out.println(overload.addTwoDigits(2.4,5.5));
        System.out.println(overload.addTwoDigits(6,7));
}
}
