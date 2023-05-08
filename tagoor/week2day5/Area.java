import java.util.Scanner;
public class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b,area;
    System.out.println("Enter the length");
    a = sc.nextInt();
    System.out.println("Enter the bredth");
    b = sc.nextInt();
    area=a*b;
    System.out.println("the area of the rectangele is" +area);
  }
}