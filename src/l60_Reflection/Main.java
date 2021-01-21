package l60_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SomeClass someClass = new SomeClass();
        Class clas = someClass.getClass();    //три основных способа получить доступ к классу
        Class clas2 = SomeClass.class;
        Class clas3 = Class.forName("l60_Reflection.SomeClass");
        SomeClass someClass1 = (SomeClass)clas.newInstance();

        Constructor[] constructors = clas.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters =constructor.getParameters();
            for(Parameter parameter:parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
    }
}

class SomeClass {
    private static int i;
    String s;

    public SomeClass() {
    }

    SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this s " + s);
        return s;
    }
}