package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UseStudent 
{
  public static void main(String[] args) 
  {
        ArrayList<Student> al = new ArrayList<>();

        Student s1 = new Student(101, "Satyam", (float) 87.9);
        Student s2 = new Student(102, "Dhoni", (float) 76.9);
        Student s3 = new Student(103, "Kholi", (float) 88.9);
        Student s4 = new Student(104, "Naman", (float) 89.9);
        
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.roll + "," + st.names + "," + st.roll);
        }

        System.out.println("");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
