
package sistec.ac;

public class SISTEC 
{
   int speedlimit=100;    
}

class SISTECGN extends SISTEC
{
  int speedlimit=150;
}

class satyam
{
    public static void main(String[] args) 
    {
       SISTEC S;
       S=new SISTECGN();
       System.out.println(S.speedlimit);
       
    }

}