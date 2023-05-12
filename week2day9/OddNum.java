
//20. WAP to print all odd numbers between 1 to 100. - using while     loop
import java.util.Scanner;

public class OddNum {
  public static void main(String[] args) {
    int n = 1;
    while (n <= 100) {
      if (n % 2 != 0) {
        System.out.println(n);
      }
      n++;
    }

  }
}