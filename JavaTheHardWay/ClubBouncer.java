public class ClubBouncer{
  public static void main(String[]args){
    int age=21;
    boolean onGuestList=false;
    double allure=8.5;
    String gender="F";

    if(onGuestList||age>=100||(gender.equals("F")&&allure>=8)){
      System.out.println("You are allowed to enter the club.");
    }
    else{
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
