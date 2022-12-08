
package Collections;

import java.util.ArrayList;

public class Arraylist2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> fr=new ArrayList<>();
        
        fr.add("Apple");
        fr.add("Mango");
        fr.add("Banana");
        fr.add("Papaya");
        fr.add("Grapes");
        fr.add("Lichi");
        
        //accessing the element
        System.out.println("Returning The Element: "+fr.get(3));
        
        //set the new value
        fr.set(3,"Satyam");
        
        //Traversing the List
        for(String a:fr)
            System.out.println(a);
    }
    
}
