
package sistec.ac;

public class Shape 
{
    void draw()
    {
        System.out.println("Drawing......");
    }
}

class Circle extends Shape
{
   void draw()
    {
        System.out.println("Drawing Circle......");
    }
}

class Rectangle extends Shape
{
   void draw()
    {
        System.out.println("Drawing Rectangle......");
    }
}

class Triangle extends Shape
{
   void draw()
    {
        System.out.println("Drawing Triangle......");
    }

}


class UseShape
{
    public static void main(String[] args) 
    {
      Shape s;
      s =new Circle();
      s.draw();
      
      s=new Rectangle();
      s.draw();
      
      s=new Triangle();
      s.draw();
    }
}
