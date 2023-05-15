//WAP to find product of digits of a number.
import java.util.Scanner;
public class MulDigit
{
  public static void main(String[] args){
    Digit sc=new Digit();
    sc.mul();
  }
}
 class Digit{
  public void mul(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int mul=1;
    do{
       int digit=n%10;
	     mul=mul*digit;
       n=n/10;
    }while(n!=0);
   System.out.println("the multiplication of a number is:" +mul);
  }
}