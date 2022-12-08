
package AutomationLab;

import static AutomationLab.Findsubstring.isSubString;

public class Findsubstring 
{
   public static boolean isSubString(String main,String sub) 
   {
      boolean b=main.contains(sub);
      return b;
   }
}

class UseFindsubstring
{
    public static void main(String[] args) 
    {
        boolean b=isSubString("Good Morning","oo");
        System.out.println(b);
    }
}
