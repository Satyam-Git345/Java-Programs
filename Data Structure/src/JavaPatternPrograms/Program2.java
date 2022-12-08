package JavaPatternPrograms;

public class Program2 
{
    public static void main(String[] args) 
    {
        int row=6,i,j;
        
        for (i = 1; i <= row; i++) 
        {
            for (j =2*(row-i); j>=0; j--) 
            {
                System.out.print(" ");
            }
            
            for (j = 1; j<=i; j++) 
            {
                System.out.print("*"+" ");
            }
            
            System.out.println("");
        }
    }    
}
