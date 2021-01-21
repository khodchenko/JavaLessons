package l50_Collections;

import java.lang.reflect.Array;
import java.util.*;

class Book {
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }

    String author;

    public Book(String author) {
        this.author = author;
    }
}

    public class CollectionExample {


        public static void main(String[] args) {
//        List collection = new ArrayList();
//        Set collection2 = new HashSet();
//        Queue collection3 = new PriorityQueue();
//        Map collection4 = new HashMap();
//        Collection collection = new ArrayList();
//        collection.add("1");
//        collection.add("2");
//        collection.add("3");
//        collection.remove("2");
//
//        for (Object o:collection)
//        {
//            System.out.println(o);
//        }

//        List collection = new ArrayList();
//        List collection1 = new ArrayList();
//        collection.add("1");
//        collection.add("2");
//        collection.add("5");
//        collection.set(2,"7");
//        collection.add("7");
//        for(int i =0;i<collection.size();i++){
//            System.out.println(collection.get(i));
//        }
//    Queue collection = new PriorityQueue();
//        collection.offer("1");
//        collection.offer("2");
//        collection.offer("3");
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(collection.size());
//
//    }
//        Set collection = new HashSet();
//        collection.add("1");
//        collection.add("2");
//        collection.add("2");
//        collection.add("2");
//        collection.add("2");
//        collection.add("3");
//        for(Object o : collection){
//            System.out.println(o);
//        }

            Map collection = new HashMap();
            collection.put(1, "11");
            collection.put(2, new Book("22"));
            collection.put(3, "33");
            collection.put(4, "44");
            collection.put(5, "55");
//            for (int i = 1; i < collection.size(); i++) {
//                System.out.println(collection.get(i));
//            }
            Set set = collection.entrySet();
            for(Object o:set){
                System.out.println(o);
            }

        }
    }
