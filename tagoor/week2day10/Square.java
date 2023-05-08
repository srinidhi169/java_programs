//Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program
import java.lang.Math;
import java.util.*;
public class Square{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a value");
    double x=s.nextDouble();
    double sq=Math.sqrt(x);
    if(sq==(int)sq){
    System.out.println("perfect square");
    }
    else
      System.out.println("not a perfect square");
  }
}