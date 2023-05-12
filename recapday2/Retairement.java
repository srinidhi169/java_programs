//Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)
import java.util.Scanner;
public class Retairement {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age in years:");
    int age=sc.nextInt();
    int retairement=65;
    int remains;
    remains=(retairement-age);
    System.out.println("the remaining years for retirement is " + remains);
  }
}
