import java.util.Scanner ;
public class Lab01v2_12
{ 
  public static void main (String[]args)
  {
    Scanner scan = new Scanner(System.in) ;
    int num ;
    num = scan.nextInt() ;
    for ( int c=1 ; c<=num ; c++)
    {
      System.out.print(c);
    }
  }
}