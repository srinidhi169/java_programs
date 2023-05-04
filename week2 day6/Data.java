// accepting name age and percentage from the student
import java.util.Scanner;
public class Data {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    float percentage;
    System.out.println("Enter your name");
    name = sc.nextLine();
    System.out.println("Enter your age");
    age= sc.nextInt();
    System.out.println("Enter your percentage");
    percentage = sc.nextFloat();
    System.out.println("Entered details are:");
    System.out.println(name);
    System.out.println(age);
    System.out.println(percentage);
  }
}
