import java.util.Scanner ;
public class Lab01v2_07
{ 
  public static void main (String[]args)
  {
    Scanner scan = new Scanner(System.in) ;
    int x, y;
    x=scan.nextInt();
    y=scan.nextInt();
    int line ;
    for(line=0 ; line<x ; line++)
    {
      if(line==0)
      {
        for(int c=0 ; c<y-1 ; c++)
        {
          System.out.print("*");
        }
      }
      if(line==x-1)
      {
        for(int c=0 ; c<y-1 ; c++)
        {
          System.out.print("*");
        }
      }
      System.out.print("*");
      if(line==0) 
      {
        System.out.println();
      }
      else if (line==x-1)
      {
        System.out.println();
      }
      else
      {
      for (int gap=0; gap<y-2;gap++)
      {
        System.out.print(" ");

      }
      System.out.print("*");
     System.out.println();
    }
  }
  }
}