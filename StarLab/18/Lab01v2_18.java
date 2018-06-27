import java.util.Scanner;
public class Lab01v2_18
{
  public static void main(String [] args)
  {
    Scanner scan=new Scanner(System.in);
      int h=scan.nextInt();
       for(int c=1;c<=h;c++)
       {
        for(int gap=1; gap<=h-c; gap++) 
        {
         System.out.print(" ");
        }
        for(int i=1; i<=2*c-1; i++)
        {
          System.out.print(i);
        }
        System.out.println();
        
       }
       for(int k=h-1; k>=1; k--)
       {
         for(int s=1; s<=h-k; s++) 
         {
           System.out.print(" ");
         }
         for(int j=1; j<=2*k-1; j++)
         {
           System.out.print(j);
         }
         System.out.println();
        
       } 
  }
}
