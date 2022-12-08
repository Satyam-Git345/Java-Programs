package satyam;

class Demo
{
   public static void main(String[] args) 
   {
      Shape s=new RectAngle();
      s.Draw();
   }
}   

public class Shape 
{
   private void Draw()
   {                 
       System.out.println("Shape");
   }
}

class Circle extends Shape
{
    public void Draw()
    {
       System.out.println("Circle");
    }
}

class RectAngle extends Circle 
{
    public  void Draw()
    {
       System.out.println("Circle");
    }
}



