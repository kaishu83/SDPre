import java.util.Scanner;

public class ForgetfulMachine{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    System.out.println("What ciy is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();//2nd question blow up when I type decimal

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();//3rd question blow up when I type String since it needs to be doulbe.

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();
  }
}
