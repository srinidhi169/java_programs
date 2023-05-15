//write a java program to find sum of first digit and last digit of a positive integer
import java.util.Scanner;
public class FirstDigit
{
  public static void main(String[] args){
    Digit sc=new Digit();
    sc.sum();
  }
}
 class Digit{
  public void sum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=0;
    int firstdig=0,lastdig=0;
    lastdig=n%10;
    for(int i=n;i!=0:i=i%10){
       firstdig=n%10;
    }
    sum=firstdig+lastdig;
   System.out.println("the sum of fist and last digit a number is:" +sum);
  }
}