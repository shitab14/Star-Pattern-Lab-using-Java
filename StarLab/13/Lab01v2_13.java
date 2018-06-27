import java.util.Scanner ;
public class Lab01v2_13
{ 
  public static void main (String[]args)
  {
    Scanner scan = new Scanner(System.in) ;
    int hor, ver ;
    ver = scan.nextInt() ;
    hor = scan.nextInt() ;
    for(int c=0; c<ver ; c++)
    {
      for(int i=1; i<=hor ; i++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}