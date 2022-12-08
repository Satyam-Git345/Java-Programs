package stack2;

public class stack2 
{
    static final int MAX = 100;
    int first;
    int[] stack_arr = new int[MAX];
    
    
    public stack2()
    {
        first=-1;
        System.out.println("Constructor Called.......");
    }
    
    
    void Push(int data) 
    {
        first+=1;
        for(int i=first;i>0;i--)
        {
            stack_arr[i]=stack_arr[i-1];
        }
        
        stack_arr[0]=data;
        System.out.println("Data Inserted Sucessfully: "+stack_arr[0]);
    }
    
    int pop()
    {
       int i,value;
       value=stack_arr[0];
       
        for (i = 0; i <first; i++) 
        {
           stack_arr[i]=stack_arr[i+1];    
        }
       first-=1;
       return value;
    }
    
    void Display() 
    {
        System.out.println("Stack Elements are: ");
        int i;
        
        for (i=0; i<=first;i++) 
        
             System.out.print(stack_arr[i] + "\t");
        
      
         System.out.println("Top Most Element of the stack Is: " + i);
    }
    
}

class UseStack2
{
    public static void main(String[] args) 
    {
        stack2 s=new stack2();
        
        
        for (int i = 1; i < 10; i++) 
             s.Push(i);
             System.out.println("");
             s.Display();
             System.out.println("");
             int deleted=s.pop();
          
             System.out.println("Element Deleted SucessFully: "+deleted);
             s.Display();
             
             int deleted1=s.pop();
          
             System.out.println("Element Deleted SucessFully: "+deleted1);
             s.Display();
    }
    
}