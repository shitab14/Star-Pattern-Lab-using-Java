import java.util.Scanner;
public class Lab01v2_15
{
  public static void main(String [] args)
  {
     Scanner scan=new Scanner(System.in);
      int h=scan.nextInt();
       for(int c=1; c<=h; c++)
       {
        for(int i=1; i<=h-c; i++) 
        {
         System.out.print(" ");
        }
         
        for(int j=c; j>=1; j--)
           {
           System.out.print(h-j+1);
         }
           System.out.println();
       }
  }
}