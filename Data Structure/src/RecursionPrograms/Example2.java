package RecursionPrograms;

public class Example2 
{
    public static void Print(int n)
    {
        if(n==11)
            return;
        
        System.out.println(n);
        Print(n+1);
    }
    
    public static void main(String[] args) 
    {
         Example2.Print(1);      
    }
}
