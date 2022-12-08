package JavaPatternPrograms;

public class Program3
{
    public static void main(String[] args) 
    {
        int row=6,i,j,count=0;
        
        for (i = 1; i <= row; i++) 
        {
            for (j =2*(row-i); j>=0; j--) 
            {
                System.out.print(" ");
                count++;
            }
            System.out.print("s"+" ");
            System.out.println("");
        }
    }    
}
