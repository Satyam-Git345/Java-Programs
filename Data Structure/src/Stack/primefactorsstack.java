package Stack;

import static Stack.Stack1.MAX;

 class primefactorsstack 
{
    static final int MAX = 100;
    int top;
    int[] arr = new int[MAX];

    public primefactorsstack () 
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
        //System.out.println(x + " Pushed into stack.....");
    }
     
     void Display() 
     {
        

        for (int x = top; x >= 0; x--) 
        {
            System.out.print(arr[x] + "\n");
        }
    }
     
     void prime_factors(int num)
     {
         int i=2,x=0;
         while(num!=1) 
         {    
            while(num%i==0)
            {
               Push(i);
               num=num/i;
               x++;
            }
            i++;
         }
         System.out.println(x);
     }
}

 class Useprimefactorsstack
{
    public static void main(String[] args) 
    {
        primefactorsstack p=new primefactorsstack ();
        
        int num=74299876;
        
        p.prime_factors(num);
        System.out.println("Prime Factors of number: "+num);
        p.Display();
    }
 }


