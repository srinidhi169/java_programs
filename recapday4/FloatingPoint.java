/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000 else add "medium"*/
import java.util.Scanner;

public class FloatingPoint{
  public static void main(String[] args){
    Floating fp=new Floating();
    fp.floating();
  }
}
class Floating{
  public void floating(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    float num=sc.nextFloat();
    if(num==0){
      System.out.println("zero");
    }
    else if(num>0){
      System.out.println("positive");
    }
    else if(num<0){
      System.out.println("negative");
    }
  if(num<1 &&num >0){
      System.out.println("small");
    }
    else if(num>1000000){
      System.out.println("large");
    }
    else{
      System.out.println("medium");
    }
  }
}