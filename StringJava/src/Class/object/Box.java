
package Class.object;

public class Box 
{

    private  int l, b,h;

    public Box(int l, int b, int h) 
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void show()
    {
        System.out.println("Length="+this.l);
        System.out.println("breath="+this.b);
        System.out.println("Hight="+this.h);
    }
       
}

class UseBox
{
    public static void main(String[] args) 
    {
        Box b=new Box(10,20,30);
        b.show();
    }
}