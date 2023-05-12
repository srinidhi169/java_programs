//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.Scanner;
import java.lang.Math;
public class Decimal {
  public static void main(String[] args){
    Test call= new Test();
    call.threeDecimal();
  }
}

 class Test { 
  public void threeDecimal(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an integer");
    float x=sc.nextFloat();
    System.out.println("enter an integer");
    float y=sc.nextFloat();
    float decimal=(float)0.001;
    
    if(Math.abs(x-y)<decimal){
      System.out.println("the numberis same for upto 3 decimal places");
    }
    else{
       System.out.println("they are different");
    }
  }
}