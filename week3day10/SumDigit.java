//WAP to find sum of digits of a number.
import java.util.Scanner;
public class SumDigit
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
    do{
       int digit=n%10;
	     sum=sum+digit;
       n=n/10;
    }while(n!=0);
   System.out.println("the sum of a number is:" +sum);
  }
}