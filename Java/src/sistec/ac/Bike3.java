package sistec.ac;
 final class Bike3 
{
    
}
class Bike4 extends Bike3
{
  void run()
  {
     System.out.println("running safely with 100kmph");
  }

  
  public static void main(String[] args) 
  {
     Bike4 b=new Bike4(); 
     b.run();
  }
} 