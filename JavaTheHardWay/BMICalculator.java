import java.util.Scanner;
public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    double m, kg,bmi;

    System. out.print("Your height in inch: ");
    double inch=keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    double lbs=keyboard.nextDouble();

    m=0.0254*inch;
    kg=0.453592*lbs;
    bmi=kg/(m*m);

    System.out.println("Your BMI is "+bmi);
  }
}
