
package Class.object;

import java.util.Scanner;

public class student2 
  {
    private  int roll;
    private  String grade;
    private float per;
    
    public void setdata()
    {
        Scanner kb=new Scanner(System.in); 
        System.out.println("Enter roll,grade,par :");
        roll=kb.nextInt();
        grade=kb.next();
        per=kb.nextFloat();
        System.out.println(" ");
    }
    
    public void showdata()
     {
         System.out.println("Students details are: ");
         System.out.println("Roll= "+roll);
         System.out.println("Grade= "+grade);
         System.out.println("Per= "+per);
     }
 }


  class Usestudent2
  {
      public static void main(String[] args) {
         student2 stu=new student2 ();
         stu.setdata();
         stu.showdata();
      }
  }