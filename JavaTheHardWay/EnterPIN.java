import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args)  {
  Scanner keyboard=new Scanner(System.in);
  int pin,entry;

  pin= 12345;

  System.out.print("WELCOME TO THE BANK OF JAVA.");
  System.out.print("ENTER YOUR PIN: ");
  entry=keyboard.nextInt();


  while(entry!=pin){
    System.out.print("\nINCORRECT PIN. TRY AGAIN");
    System.out.print("ENTER YOUR PIN: ");
    entry=keyboard.nextInt();
  }
  System.out.print("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
}


}
