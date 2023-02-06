package svjat.animals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionPoint {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add(1);

        for(Object o:list){
            System.out.println("1 " + o);
        }
        Collection list2 = new ArrayList();
        list2.addAll(list);
        list2.remove("A");

        for(Object o:list2) {
            System.out.println("2 " + o);
        }
        Collection set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("B");
        set.addAll(list);

        for(Object o:set) {
            System.out.println("set " + o);
        }
        list = new HashSet(list);
        for(Object o:list) {
            System.out.println("New list " + o);
        }


    }
}
