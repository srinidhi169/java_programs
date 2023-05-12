//Write a Java program that prompts the user to enter their weight in kilograms and height in meters, and calculates their body mass index (BMI) using conditional statements and you need to print underweight,healthy ,overweight and obessity according to the following
   // bmi <18                underweight
   // bmi >=18 and bmi<25    healthy
   // bmi>=25 and bmi<30     overweight
   // bmi>=30                obessity
import java.util.Scanner;
public class Weight {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the weight:");
    double weight=sc.nextDouble();
    System.out.println("Enter the height:");
    double height =sc.nextDouble();
    double bmi;
    bmi=(weight/(height*height));
    System.out.println("body mass index is:" +bmi);
    if(bmi<18){
       System.out.println("under weight");
    }
    else if(bmi>=18 && bmi<25){
       System.out.println("healthy");
    }
    else if(bmi>=25 && bmi<30){
       System.out.println("over weight");
    }
    else if(bmi>=30){
       System.out.println("obesity");
    }
  }
}
    