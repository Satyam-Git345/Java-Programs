package JavaPatternPrograms;

public class Program9 
{
    
    static 
    {
        System.out.println("Static Block calleed....");
    }
    
    {
        System.out.println("Initializer Block called....");
    }
    
    public Program9()
    {
        System.out.println("Constructor Called.......");
    } 
    
    public void Massage()
    {
        System.out.println("Method called........");
    }
        
    
    
    public static void main(String[] args) {
        Program9 p=new Program9();
        p.Massage();
        
    
    
    }
}
