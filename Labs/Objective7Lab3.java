import java.util.Scanner;
public class Objective7Lab3{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    int selection=1;

    while(selection!=3){

      printMenu();
      selection=scanner.nextInt();
      switch(selection){
        case 1: System.out.println("Hello Human");break;
        case 2: System.out.println("Apple, Banana, Coconuts");break;
        case 3: System.out.println("Goodbye");break;

      }
    }
  }
  public static void printMenu(){
    System.out.println("___Menu___");
    System.out.println("1: Say Hello");
    System.out.println("2:List my favorite foods");
    System.out.println("3:Exit");
  }
}
