package l54_Maps;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        Map map = new HashMap(); //ключи и значения
        Map map1 = new Hashtable();
        Map map2 = new LinkedHashMap();
        Map map3 = new TreeMap();
        map.put("1","one");
        map.put("3","three");
        map.put("2","two");
        System.out.println(map.get("3"));
    }
}
