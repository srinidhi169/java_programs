//17. WAP to print the sum of natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class SumOfNatural
{
  public static void main(String[] args){
    int n,sum=0,a=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    while(a<=n)
    {
       sum=sum+a;
       a++;
    }
    System.out.println("the sum is " +sum);
  }
}