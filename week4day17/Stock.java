
/*You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a program in Java to accomplish this.*/
import java.util.Scanner;

public class Stock {
  public static void main(String[] args) {
    All c = new All();
    c.analysis();
  }
}

class All {
  public void analysis() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no.of stocks");
    int n = sc.nextInt();
    System.out.println("Enter stock prices");
    double s[] = new double[n];
    for (int i = 0; i < s.length; i++)
      s[i] = sc.nextDouble();
    double minimum = s[0];
    double maximum = s[0];
    for (int i = 0; i < s.length; i++) {
      if (minimum > s[i]) {
        minimum = s[i];
      }
      if (maximum < s[i]) {
        maximum = s[i];
      }
    }
    System.out.println("the maximum stock price is " + maximum);
    System.out.println("the minimum stock price is " + minimum);
  }
}