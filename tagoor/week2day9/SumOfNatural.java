//17. WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class SumOfNatural
{
  public static void main(String[] args){
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    while(n>0)
    {
       int digit=n%10;
	     sum=sum+digit;
	     n=n/10;
    }
    System.out.println("the sum is " +sum);
  }
}