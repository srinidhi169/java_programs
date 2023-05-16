//26. WAP to count number of digits in a number.
import java.util.Scanner;
public class Count{
  public static void main(String[] args) {
    All sn = new All();
    sn.countNum();
  }
}

class All {
  public void countNum(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    int count=0;
    while(n!=0){
      int digit=n%10;
      count++;
      n=n/10;
    }
    System.out.println("the number of digits are " + count);
  }
}
    