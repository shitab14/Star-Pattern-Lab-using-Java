import java.util.Scanner;
public class Lab01v2_24
{
  public static void main (String [] args)
  {
    int x;
    Scanner scan = new Scanner(System.in);
    x=scan.nextInt();
    for( int n=1; n<=x ; n++)
    {
      System.out.print(n);
    }
    for( int y=x-1; y>0; y--)
    {
      System.out.print(y);
    }
  }
}
