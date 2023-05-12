//Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.
import java.util.Scanner;
public class Maximum {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 3 numbers");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    if ((num1>num2) && (num1>num3)){
      System.out.println(num1+" is maximum number");
    else if ((num2>num1) && (num2>num3))
      System.out.println(num2+" is maximum number");
    else
      System.out.println(num3+" is maximum number");
     }    
    if ((num1<num2) && (num1<num3)){
      System.out.println(num1+" is minimum number");
    else if ((num2<num1) && (num2<num3))
      System.out.println(num2+" is minimum number");
    else
      System.out.println(num3+" is minimum number");
      }
  }
}






 



