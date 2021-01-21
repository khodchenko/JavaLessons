package l51_Collections_Sort;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class Person {
    int age;

    public Person(int age)  {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2){
        return o1.age - o2.age;
    }

}
public class SortExample {
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(2));
        set.add(new Person(4));
        set.add(new Person(6));
        set.add(new Person(1));
        set.add(new Person(25));
        for (Object o : set){
            System.out.println(o);
        }

    }
}
