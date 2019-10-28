import java.util.Scanner;
public class Objective3Lab1{
  public static void main(String[] args){
    String userIput="";
    Scanner input=new Scanner(System.in);

    System.out.println("Please Type a word: ");

    userIput=input.next();

    System.out.println(userIput);

    input.close();
  }
}
