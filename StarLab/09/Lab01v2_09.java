import java.util.Scanner ;
public class Lab01v2_09
{ 
  public static void main (String[]args)
  { 
    Scanner scan = new Scanner(System.in) ;
    int h;
    int c;
    h=scan.nextInt();
    int gap;
    int h2=h;
    for(c=0; c<h; c++)
    {
      for(gap=h2-1;gap>0;gap--)
      {
        System.out.print(" ");
      }
      System.out.print("*");
      
      if(gap==h2-1)
      {
        for(int i=0;i<h-1;i++)
        {
        System.out.print("*");
        }
      }
      if(c>0&&c!=h-1)
      {
        for(int j=1; j<c;j++)
        {
        System.out.print(" ");
        }
      System.out.print("*");
      }
      System.out.println();
      h2--;
    }
  }
}