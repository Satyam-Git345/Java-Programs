
package Class.object;

import java.util.Scanner;


public class satyam {
    static int B;
    static int H;
    static boolean flag=true;
    
    static
    {
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    
    
    try
    {
        if(B<=0 ||  H<=0)
        {
            flag=false;
            throw new Exception("Breadth and height must be positive");
        }

    }
  catch(Exception e)
  {
    
    System.out.println(e);
    System.exit(0);
  }
} 

public static void main(String[] args){
		if(flag)
                {
	            int area=B*H;
		    System.out.print("Area="+area);
		}   
}

}
