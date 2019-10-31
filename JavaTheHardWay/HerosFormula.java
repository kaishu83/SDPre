public class HerosFormula{
  public static void main(String[] args){
    double a,g;
    String tws="A triangle with sides";

    a=triangleArea(3,3,3);
    System.out.println("A triagnle with sides 3,3,3 has area "+a);

    a=triangleArea(3,4,5);
    System.out.println("A triagnle with sides 3,4,5 has area "+a);

    g=triangleArea(7,8,9);
    System.out.println(tws+" 7,8,9 has area"+g);

    System.out.println(tws+" 5,12,13 has are "+triangleArea(5,12,13));
    System.out.println(tws+" 10,9,11 has are "+triangleArea(10,19,11));
    System.out.println(tws+" 8,15,17 has are "+triangleArea(8,15,17));
  }
  public static double triangleArea(int a, int b, int c){
  double s,A;
  s=(a+b+c)/2.0;
  A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  return A;
  }
}
