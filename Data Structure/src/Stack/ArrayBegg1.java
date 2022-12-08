package Stack;
import java.util.Scanner;

public class ArrayBegg1 
{
   public static int add_at_begg(int[] arr,int n,int data)
   {
      int i;
      for(i=n-1;i>=0;i--)
          arr[i+1]=arr[i];
     
      
      arr[0]=data;
      System.out.println("Data inserted Sucessfully beggning of Array "+data);
      return n+1;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[10];
        int n,i;
        
        
        System.out.print("Enter the Number of elements of the Array: ");
        n=sc.nextInt();
        for ( i = 0; i < n; i++) 
        {
            int x=sc.nextInt();
            arr[i]=x;
        }    
        
        System.out.println("Before calling Funcation: ");
        for ( i = 0; i < arr.length; i++) 
                   System.out.println("\t"+ arr[i]);
        
        
        ArrayBegg1.add_at_begg(arr, n, 10);
        System.out.println(""); 
        
        System.out.println("After calling Funcation: ");
        for ( i = 0; i < arr.length; i++) 
                   System.out.println("\t"+ arr[i]);
        
        
    }    
}
