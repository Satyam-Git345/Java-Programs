package Basicprograms;

public class Satyam 
{
     public static void main(String[] args) 
     {
          int a = 0;
          for (int i = 1; i <= 10; i++) 
          {
            for (int j = 1; j <= 10; j++)
            {
                a = a++;
            }
          }
          System.out.println(a);
     }
}
