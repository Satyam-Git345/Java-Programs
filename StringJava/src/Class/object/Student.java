
package Class.object;


public class Student 
{
    int rool;
    String name;
    double per;
    
   
    public String toString() 
    {
        return "Student{" + "rool=" + rool + ", name=" + name + ", per=" + per + '}';
    
    }
 }

class Usestudent
{
    public static void main(String[] args) 
    {
       Student s1=new Student();
       s1.rool=101;
       s1.name="satyam";
       s1.per=88.55;
       System.out.println(s1);
       
       
       System.out.println(" ");
        
       Student s2=new Student();
       s2.rool=102;
       s2.name="Naman";
       s2.per=89.55;
       System.out.println(s2);
     
       Student s3=new Student();
       System.out.println(" ");
       System.out.println(s3); 
            
     }
}
