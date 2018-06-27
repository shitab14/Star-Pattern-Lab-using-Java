import java.util.Scanner ;
public class Lab01v2_14
{ 
  public static void main (String[]args)
  { 
    Scanner scan = new Scanner(System.in) ;
  int h;
  int c;
  int i;
  int n = 1;
  h=scan.nextInt() ;
  for(i=0;i<h;i++)
  {
    for(c=1; c<=n ; c++)
    { 
      System.out.print(c) ;

    }
    System.out.println() ;
    n++;
}
}
}