import java.util.Scanner;
public class Objective3Lab5{
  public static void main(String[] args){
    double num1, num2, sum1;
    Scanner input=new Scanner(System.in);

    System.out.println("Please enter a numer:");
    num1=input.nextDouble();

    System.out.println("Please enter another number:");
    num2=input.nextDouble();

    sum1=num1+num2;
    System.out.print("The sum of ");
    System.out.print(num1);
    System.out.print(" + ");
    System.out.print(num2);
    System.out.print(" = ");
    System.out.println(sum1);
  }
}
