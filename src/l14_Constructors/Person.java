package l14_Constructors;

public class Person {
    public int height;
    public String name;
    public void say(String name) {
        System.out.println("Hello"+name);
    }
    public Person() {
    }

    public Person(int h, String n) {
        height = h;
        name = n;
    }

    public Person( String n) {
        name = n;
    }
}
