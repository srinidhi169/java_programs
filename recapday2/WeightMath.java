import java.util.Scanner;
import java.lang.Math;
class WeightMath{
  public static void main(String[] args){
    double weight,height,body_Mass;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the weight in kilograms");
    weight=sc.nextDouble();
    System.out.println("Enter the height in meters");
    height=sc.nextDouble();
    body_Mass=weight/(Math.pow(height,2.0));
    if(body_Mass>18){
      System.out.print("underweight");
    }
    else if(body_Mass<25){
      System.out.print("healthy");
    }
    else if(body_Mass<30){
      System.out.print("overweight");
    }
    else{
      System.out.print("obessity");
    }
  }
}