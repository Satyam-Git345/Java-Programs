
package StarPattern;


public class Pattern3 
{
    public static void main(String[] args) 
    {
        int Lines=10;
       
        for (int i=1;i<=Lines;i++) 
        {
            for (int j = 1; j <=i; j++) 
            {
                
                 System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
    
}
