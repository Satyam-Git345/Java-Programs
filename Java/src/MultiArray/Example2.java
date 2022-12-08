package MultiArray;

public class Example2 
{
    public static void main(String[] args) 
    {
        int [][] arr=new int[3][3]; 
        int [][] brr=new int[3][3];
        int [][] crr=new int[3][3];
        
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=2;
        arr[1][1]=4;
        arr[1][2]=5;
        arr[2][0]=4;
        arr[2][1]=4;
        arr[2][2]=5;
        
        brr[0][0]=1;
        brr[0][1]=2;
        brr[0][2]=3;
        brr[1][0]=2;
        brr[1][1]=4;
        brr[1][2]=5;
        brr[2][0]=4;
        brr[2][1]=4;
        brr[2][2]=5;
        
        
        //Adding Two Matrixs
          for(int i=0; i<3;i++)
          {
             for(int j=0; j<3;j++)
                  crr[i][j]=arr[i][j]+brr[i][j];
             
                  
          }
        
          
         System.out.println("First Array is: ");
         for(int i=0; i<3;i++)
         {
            for(int j=0; j<3;j++)
                 System.out.print(arr[i][j]+" ");
         
                 System.out.println("");
         }
         
         
         System.out.println("");
         
         System.out.println("Second Array is: ");
         for(int i=0; i<3;i++)
         {
             for(int j=0; j<3;j++)
                  System.out.print(brr[i][j]+" ");
             
                  System.out.println("");
         }
         
         
         System.out.println("");
         System.out.println("Third array is: ");
         for(int i=0; i<3;i++)
         {
             for(int j=0; j<3;j++)
                  System.out.print(crr[i][j]+" ");
             
                  System.out.println("");
         }
          
          
    }
    
}
