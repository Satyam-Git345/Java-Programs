
package Class.object;

public class Student1 
{
   private  int roll;
   private char grade;
   private float per;    


  public void Setdata()
  {
          roll=101;
          grade ='A';
          per=9.33f;
  }
  
   public void Showdata()
   {
       System.out.println(roll);
       System.out.println(grade);
       System.out.println(per);
       
   }
}      
 
   class Usestudent1
    {
        public static void main(String[] args) 
        {
           Student1 s1=new Student1();  
           s1.Setdata();
           s1.Showdata();
        
          
        }
    
    }


















