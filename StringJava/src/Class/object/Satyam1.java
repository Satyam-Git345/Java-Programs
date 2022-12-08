package Class.object;

public class Satyam1 
{
    int a, b;
    String s;
    float f;
    public Satyam1()
    {
        System.out.println("Constructor called");
    }
    
    public void Show()
    {
        System.out.println(a+", "+b+", "+s+", "+f);
    }
    
    public static void main(String[] args) 
    {
        Satyam1 s=new Satyam1();
        s.Show();
    }
    
}
