//24. WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOdd
{
  public static void main(String[] args){
    int n,sum=0,a=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    while(a<=n)
    {
      if(a%2!=0){
             sum=sum+a;
      }
       a++;
    }
    System.out.println("the sum is " +sum);
  }
}