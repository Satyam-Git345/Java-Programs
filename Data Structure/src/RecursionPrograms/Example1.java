package RecursionPrograms;

public class Example1 
{
    public static void PrintNumbers(int n)
    {
        if(n==0)
            return;
        
        System.out.println(n);
        PrintNumbers(n-1);
    }
    
    public static void main(String[] args) 
    {
        Example1.PrintNumbers(10);      
    }

    static void PrintNumber(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
