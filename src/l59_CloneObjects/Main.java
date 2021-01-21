package l59_CloneObjects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject myObject = new MyObject();
        myObject.i = 1;

        NewObject newObject = new NewObject();
        newObject.j = 3;
        myObject.newObject = newObject;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
    }
}

class MyObject {
    int i;
    NewObject newObject;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}

class NewObject {
    int j;
}