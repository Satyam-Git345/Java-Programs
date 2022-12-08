
package AutomationLab;

public class AverageArray 
{
    public static void main(String[] args) 
    {
       int[] arr={1,4,3,2,9,4,1,7,6,5};
       
       int total=0;
       
       for(int e:arr)
       {
          total=total+e;
       }
       
        System.out.println(total);
        System.out.println(arr.length);
        
        System.out.println((double)total/arr.length);
    }
    
}
