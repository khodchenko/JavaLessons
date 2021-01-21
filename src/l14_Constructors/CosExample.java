package l14_Constructors;

public class CosExample {
    public static void main(String[] args) {
        Person person = new Person(180,"John");
        Person person1 = new Person();
        Person person2 = new Person("Fedor");


        Student student = new Student(165,"Lisa", 1);
        student.tell();

    }

}
