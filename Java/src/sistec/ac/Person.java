
package sistec.ac;

public class Person 
{
    int id;
    String name;
    public Person(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    
    {
        System.out.println("Good Morning");
    }
}

class Emp extends Person
{
  float salary;
  public Emp(int id, String name,float salary)
  {
       super(id,name);
       this.salary=salary;
  }
  
  void display()
  {
      System.out.println(id+","+name+","+salary);
  }  
}

class UsePerson
{
    public static void main(String[] args) 
    {
       Emp e=new Emp(101,"Satyam Shukla",77000.88f);
       e.display();
    }
}