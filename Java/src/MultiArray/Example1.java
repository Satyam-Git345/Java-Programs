
package MultiArray;

public class Example1 
{
    public static void main(String[] args)
    {
        int [][] arr=new int[3][3];
        
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        
        arr[1][0]=2;
        arr[1][1]=4;
        arr[1][2]=5;
        
        arr[2][0]=4;
        arr[2][1]=4;
        arr[2][2]=5;
        
        for(int i=0; i<3;i++)
        {
           for(int j=0; j<3;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
            System.out.println("");
        }
        
    }
    
}
