package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList<String> fr = new ArrayList<>();
        ArrayList<Integer> fr2 = new ArrayList<>();

        fr.add("Apple");
        fr.add("Mango");
        fr.add("Banana");
        fr.add("Papaya");
        fr.add("Grapes");
        fr.add("Lichi");

        //sort the list contain strings
        Collections.sort(fr);

        //Traversing the List
        for (String a : fr) {
            System.out.println(a);
        }
        System.out.println(" ");

        fr2.add(88);
        fr2.add(36);
        fr2.add(87);
        fr2.add(65);
        fr2.add(45);
        fr2.add(34);
        fr2.add(23);
        fr2.add(56);
        fr2.add(43);

        //sort the list contain Integers
        Collections.sort(fr2);

        for (Integer a : fr2) {
            System.out.println(a);
        }
    }
}
