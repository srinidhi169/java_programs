//read 5 inputs from the user and print using string(5 names of cities)
import java.util.Scanner;
public class Array2{
  public static void main(String[] args) {
    All sn = new All();
    sn.array();
  }
}

class All {
  public void array() {
    Scanner sc = new Scanner(System.in);
    String city[]=new String[5];
    System.out.println("enter the names of cities:");
    for(int i=0;i<city.length;i++){
      city[i]=sc.nextLine();
    }
   System.out.println("the entered cities are:");
    for(int i=0;i<city.length;i++){
      System.out.println(city[i]);
    }
  }
}