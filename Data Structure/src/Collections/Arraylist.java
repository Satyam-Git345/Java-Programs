package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist 
{
    public static void main(String[] args) 
    {
       ArrayList<String> arraylist=new ArrayList<String>();
       
       arraylist.add("Ravi");
       arraylist.add("Ajay");
       arraylist.add("Ravi");
       arraylist.add("Vijay");
       arraylist.add("Satyam");
       arraylist.add("Naman");
      
       //using iterator
       Iterator itr=arraylist.iterator();
       while(itr.hasNext())
            System.out.println(itr.next());   
       
       System.out.println("");
       
       //using for-each loop
       for(String names:arraylist)
            System.out.println(names);
       
    }
}
