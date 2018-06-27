import java.util.Scanner ;
public class Lab01v2_01
{ public static void main (String[]args)
  { Scanner scan = new Scanner(System.in) ;
  int x ;
  int c=0;
  x=scan.nextInt() ;
  while(x<=0)
  {
    System.out.println(" \n Your number is not valid. Enter a valid number") ;
  x=scan.nextInt() ;
  }
  while(c<x)
  { System.out.print("*");
    c++;
  }
}
}
// © shitab.mailbox01@gmail.com