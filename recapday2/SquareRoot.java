//write a java program to read two integers and calculate absolute value ,square root of two integers
import java.util.Scanner;
import java.lang.Math;
public class SquareRoot {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 2 numbers");
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    double sq1=Math.sqrt(x);
    System.out.println("the squarerot of x is:"+ sq1);
    double sq2=Math.sqrt(y);
    System.out.println("the squarerot of y is:"+ sq2);
    double abs1 = Math.abs(x);
    System.out.println("Absolute val of x:" + abs1);
    double abs2 = Math.abs(y);
    System.out.println("Absolute val of y:" + abs2);
  
    }
}