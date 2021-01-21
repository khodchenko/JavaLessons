package l56_Generics;

import com.sun.tools.javac.Main;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//class Car extends GenericExample implements Comparable, Serializable {
//
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
//}
public class GenericExample<T extends GenericExample & Comparable & Serializable> {
    List<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //List<GenericExample> list = new ArrayList<>();
        List<File> list = new ArrayList();
        //list2.add("String");
        //list2.add(new GenericExample<>());
//        list2.add(new File(""));
//        for (File o : list2) {
//            File f =  o;
//
//        }
        GenericExample main = new GenericExample();
        main.method(list);
        for (File file : list) {
            System.out.println(file.getAbsoluteFile());
        }

//        GenericExample<Car> main = new GenericExample();
//        main.var = (List<String>) new Car();
//        main.method(new Car());
//    }
//    T method(T type){
//        //type.compareTo(new Object());
//        //System.out.println(type);
//        type.someMethod();
//        return type;
//    }
//    void someMethod(){
//        System.out.println("bla");
    }

    void method(List list) {
        list.add(new GenericExample<>());
    }
}
