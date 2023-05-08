import java.util.Scanner;
public class Example1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the integer");
    a = sc.nextInt();
    b = sc.nextInt();
    // addition
    System.out.println("a+b=" + (a + b));
    // subtraction
    System.out.println("a-b=" + (a - b));
    // multiplication
    System.out.println("a*b=" + (a * b));
    // division
    System.out.println("a/b=" + (a / b));
  }
}