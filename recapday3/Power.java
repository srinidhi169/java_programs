//Write a Java program to check if a given integer is a power of 2 or not, using only co nditional statements don't use loops
import java.util.Scanner;
import java.lang.Math;
public class Power{
  public static void main(String[] args){
    Power2 call=new Power2();
    call.powerMethod();
  }
}
class Power2{
  public void powerMethod(){
    double number_1,number_2=0;
    double value;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number ");
    number_1=sc.nextInt();
    value=Math.log(number_1)/Math.log(2);
    number_2=Math.pow(2,(int)value);
    if((int)number_1==(int)number_2){
      System.out.println("The given number "+(int)number_1+" is power of 2");
    }
    else{
      System.out.println("The given number "+(int)number_1+" is not power of 2");
    }
   
  }
}