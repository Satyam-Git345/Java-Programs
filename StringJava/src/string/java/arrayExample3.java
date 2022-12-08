
package string.java;
class Student
{
    
    public int roll;
    public  String name;

    public Student(int roll, String name) 
    {
        this.roll = roll;
        this.name = name;
    }
}

public class arrayExample3 
{
    
    public static void main(String[] args)
    {
        Student[] arr;
        arr=new Student[5];
       
        
        
        arr[0]=new Student(1,"Aman");
        
        arr[1]=new Student(2,"Satyam");
        
        arr[2]=new Student(3,"Kapil");
        
        arr[3]=new Student(4,"Ankit");
       
        arr[4]=new Student(5,"Satyam");
      
        System.out.println("Length Of Array is :"+arr.length);
        
          System.out.println(" ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Student no "+i);
            System.out.println("");
            System.out.println(arr[i].roll+" -> "+arr[i].name);
            
        }  
        
       
        
    }
    
}
