package StringQuestions;

public class Example2 
{
    public static void main(String[] args) 
    {
        String str="The, best! of *both wo$rlds";
        int count=0;
        
        for(int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i)==',' || str.charAt(i)=='!' || str.charAt(i)=='*' || str.charAt(i)=='$')  
            {
               count++;
            }        
        }
        
        System.out.println(count); 
    }
}
