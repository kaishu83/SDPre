import java.util.Scanner;
public class ShallowGrandmother{
  public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);
    int age;
    double income, cute,happy;
    boolean allowed, allowed2;

    System.out.print("Enter you age: ");
    age=keyboard.nextInt();

    System.out.print("Enter your yearly income: ");
    income=keyboard.nextDouble();

    System.out.print("How cute are you, on a scale from 0.0 to 10.0?");
    cute = keyboard.nextDouble();

    System.out.print("How happy do you make them?(in a scale 0 to 10)");
    happy= keyboard.nextDouble();


    allowed=(age>25&&age<40&&(income>50000||cute>=8.5));
    System.out.println("Allow to date my grandchild?  "+allowed);

    allowed2=(happy>7.0);
    System.out.println("Allow to date my grandchild by another grandmother?"+allowed2);
  }
}
