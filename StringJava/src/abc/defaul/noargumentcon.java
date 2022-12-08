package abc.defaul;
class noargumentcon 
{
    int num;
    String name;
   
   
   noargumentcon ()
   {
       System.out.println("Default constructor called!!");
   }
   
}


 class Usenoargumentcon 
{
    public static void main(String[] args) 
    {
        noargumentcon s1=new noargumentcon();
        System.out.println(num);
        System.out.println(name);
    }

    
}