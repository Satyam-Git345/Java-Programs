
package Class.object;

public class Arraypass 
{      
    public void doubler(int [] brr)
    {
        for(int i=0;i<brr.length;i++)
        {
           brr[i]=brr[i]-1;
        }   
    }     
}


 class  UseArraypass
 {
     public static void main(String[] args) 
     {
         Arraypass a1=new Arraypass();
         int [] arr={10,20,30,40,50,60,70};
         
         System.out.println("Before Doubler array will be: ");
         
          for(int i=0;i<arr.length;i++)
          {
               System.out.println("arr[i]="+arr[i]);
          }
          
         a1.doubler(arr);
     
         System.out.println(" ");
         
         System.out.println("After Doubler Array will be: ");
         
         
         for(int i=0;i<arr.length;i++)
          {
              System.out.println("arr[i]="+arr[i]);
          } 
         
         System.out.println("arr[5]="+arr[5]);
         
         
     }
}