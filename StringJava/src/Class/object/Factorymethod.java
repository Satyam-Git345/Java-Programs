package Class.object;

class Factorymethod {

    private int age;
    private String name;

    private Factorymethod(int a, String s) {
        age = a;
        name = s;
    }

    public void show() {
        System.out.println(age + " " + name);
    }

    static Factorymethod createperson(int a, String s) {
        if (a <= 0) 
            return null;
         else {
            Factorymethod P= new Factorymethod(a, s);
            return P;
        }
    }
}

class UseFactorymethod {

    public static void main(String[] args) {
      try
       {
        Factorymethod p1, p2;

        p1 = Factorymethod.createperson(25,"Amit");
            
        p2 = Factorymethod.createperson(-26,"Satyam");
        
        
        p1.show();
        p2.show();
      }
        
        catch(NullPointerException ex)
        {
            System.out.println("Object not created Due to negetive age!! ");
        }
    }
}
