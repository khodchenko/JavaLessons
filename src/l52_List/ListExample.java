package l52_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList(); //коллекция элементов с индексом
        List listv = new Vector(); //синхронизированный лист
        List listLinked = new LinkedList(); //список, хранит инфу ссылочно


        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
