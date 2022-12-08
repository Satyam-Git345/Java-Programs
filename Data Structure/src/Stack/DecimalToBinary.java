package Stack;

public class DecimalToBinary 
{
   static final int MAX = 100;
   int top;
   int[] arr = new int[MAX];

   public DecimalToBinary() 
   {
        top = -1;
   }   
    
   public boolean isFull()
   {
       if (top == MAX - 1) 
       {
            return true;
       }
       else 
       {
            return false;
       }
   }
    
     void Push(int x) 
     {
        if (isFull()) 
        {
            System.out.println("Stack OverFlow.....");
            return;
        }
        
        top = top + 1;
        arr[top] = x;
        
    }
     
     void Display() 
     {
        for (int x = top; x >= 0; x--) 
        {
            System.out.print(arr[x] + "\n");
        }
    }
     
    void DecimalToBinary(int n)
    {
       while(n!=0)
       {
         Push(n%2);
         n=n/2;
       }
    }       
     
}

 class UseDecimalToBinary 
{
     public static void main(String[] args) 
     {
         int num=1333457654;
         DecimalToBinary d=new DecimalToBinary();
         d.DecimalToBinary(num);
         System.out.println("Decimal to Binary of number of "+num+" is:");
         d.Display();
     }
    
}
