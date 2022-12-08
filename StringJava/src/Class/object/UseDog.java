
package Class.object;


public class UseDog 
{
    public static void main(String[] args) {
        Dog tuffy=new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
        System.out.println(" ");
        Dog tuffy1=new Dog("Tommey","papillon",7, "green");
        System.out.println(tuffy1.toString());
        System.out.println("tuffy Dog color : "+tuffy.getColor());
        System.out.println("tuffy Dog age : "+tuffy.getAge());
    }
    
}
