
package StarPattern;


public class Pattern1 
{
    public static void main(String[] args) 
    {
          int lines=5; 
          for(int i=1;i<=lines;i++)
          {
              for(int j=lines;j>0;j--) 
              {
                  if(i!=j)
                    System.out.print(j+"   ");
                      
                  else
                    System.out.print("*"+"   ");
              }
              
              System.out.println();  
          }
               
    }
}
    

