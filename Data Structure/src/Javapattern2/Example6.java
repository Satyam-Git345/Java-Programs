package Javapattern2;

public class Example6 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) 
        {
          for (int j = 1; j <= i; j++) 
          {
             if(i%j==0)
                  System.out.print(0+" ");
             else
                  System.out.print(1+" ");
          }
          System.out.println(" ");   
        }        
    }
}

