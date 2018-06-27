import java.util.Scanner ;
public class Lab01v2_19
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
        for(int c=1 ; c<=y ; c++)
        {
          System.out.print(c);
        }
      }
      if(line==x-1)
      {
        for(int c=2 ; c<=y ; c++)
        {
          System.out.print(c);
        }
      }

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
      System.out.print(y);
     System.out.println();
    }
     System.out.print(1);
  }
  }
}