import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, temp = 0;
    System.out.println("Enter the a value:");
    a = sc.nextInt();
    System.out.println("Enter the b value:");
    b = sc.nextInt();
    temp = a;
    a = b;
    b = temp;
    System.out.println("the swapped values are");
    System.out.println("a:" + a);
    System.out.println("b:" + b);
  }
}