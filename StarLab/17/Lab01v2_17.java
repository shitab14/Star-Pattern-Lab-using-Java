import java.util.Scanner;
public class Lab01v2_17
{
  public static void main (String [] args)
  {
    int h;
    Scanner scan = new Scanner(System.in);
    h=scan.nextInt();
    int c=1, star=1;
    while (c<=h)
    {
      int space=1;
      while(space<=h-c)
      {
        System.out.print(" ");
        space=space+1;
      }
      int col=1;
      int x=1;
      while(col<=star)
      {
        System.out.print(x);
        col=col+1;
        x=x+1;
      }
      System.out.println();
      star=star+2;
      c=c+1;
    }
  }
}