import java.util.Scanner;
public class BooleanExpressions{
  public static void main( String[] args){
    Scanner keyboard=new Scanner(System.in);
    boolean a,b,c,d,e,f;
    double x,y;

    System.out.print("Give me two number. First: ");
    x= keyboard.nextDouble();
    System.out.print("Second: ");
    y=keyboard.nextDouble();

    a=(x<y);
    b=(x<=y);
    c=(x==y);
    d=(x!=y);
    e=(x>y);
    f=(x>=y);

    System.out.println(x+" is Less THAN "+y+": "+a);
    System.out.println(x+" is LESS THAN/EQUAL "+y+": "+b);
    System.out.println(x+" is EQUAL TO "+y+": "+c);
    System.out.println(x+" is NOT EQUAL TO "+y+": "+d);
    System.out.println(x+" is GREAT THAN "+y+": "+e);
    System.out.println(x+" is GREAT THAN/EQUAL "+y+": "+f);
    System.out.println();



    System.out.println( !(x < y) + " " + (x >= y) );
    System.out.println( !(x <= y) + " " + (x > y) );
    System.out.println( !(x == y) + " " + (x != y) );
    System.out.println( !(x != y) + " " + (x == y) );
    System.out.println( !(x > y) + " " + (x <= y) );
    System.out.println( !(x >= y) + " " + (x < y) );


  }
}
