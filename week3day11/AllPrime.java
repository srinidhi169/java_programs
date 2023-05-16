
//write a program to check all strong numbers from 1 to n where n is an integer
import java.util.Scanner;

public class AllStrong{
  public static void main(String[] args) {
    All sn = new All();
    sn.prime();
  }
}

class All {
  public void Strong() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    int counter;
    System.out.print("strong numbers are ");
    for (int j = 2; j <= n/2; j++) {
      counter = 0;
      for (int i = 1; i <= j; i++) {
        if (j % i == 0) {
          counter++;
        }
      }
      if (counter == 2)
        System.out.print(j + " ");
    }
  }
}