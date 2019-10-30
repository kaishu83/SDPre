public class Objective6Lab3{
  public static void main(String[] args){
    int counter=1;
    String s="";

    while(counter<=20){
      if(counter%2==0) {
        s="even";}
        else s="odd";

      System.out.println(counter+" is "+s);
      counter++;
    }


  }
}
