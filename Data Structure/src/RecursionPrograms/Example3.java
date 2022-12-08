package RecursionPrograms;

public class Example3 
{
    public static void NaturalSum(int i,int n,int sum)
    {
          if(i==n)
          {
              sum=sum+i;
              System.out.println(sum);
              return;
          }
          
          sum=sum+i;
          NaturalSum(i+1, n, sum);
    }
    
    public static void main(String[] args) 
    {
       int n=5; 
       Example3.NaturalSum(1,10,0);
    }
}
