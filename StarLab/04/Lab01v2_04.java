import java.util.Scanner ;
public class Lab01v2_04
{ public static void main (String[]args)
  { Scanner scan = new Scanner(System.in) ;
 int h ;
 int n = 1 ;
 int c ;
 int j ;
  h = scan.nextInt();
  for ( int i=0 ; i<h ; i++)
  {
  for ( c=h-n ; c!=0 ; c--)
  { System.out.print(" ") ;
  }
  for( j=0 ; j<n ; j++)
  { System.out.print("*") ;
  }
    n++ ;
  System.out.println();
  }
}
}