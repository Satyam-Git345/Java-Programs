package AutomationLab;

abstract class Shape 
{
   abstract void Draw();
}

class Rectangle extends Shape
{
    @Override
    void Draw() 
    {
        System.out.println("Drawing Ractangle.......");    
    }
}

 class Circle extends Shape
{

    @Override
    void Draw() 
    {
        System.out.println("Drawing Circle.......");    
    }
}


class TriAngle extends Shape
{
    @Override
    void Draw() 
    {
        System.out.println("Drawing Triangle.......");    
    }
}

class UseShape
{
    public static void main(String[] args)
    {
       Shape s;
       
       s=new Rectangle();  
       s.Draw();
       
       s=new Circle();
       s.Draw();
       
       s=new TriAngle();
       s.Draw();
    }
}