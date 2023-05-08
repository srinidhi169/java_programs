//given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)
import java.util.Scanner;
public class BitweenOdd
  {
    public static void main(String[] args)
    {
       int count=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter min and max values");
       int a=sc.nextInt();
       int b=sc.nextInt();
      if(a%2!=0)
      {
      count++;
      }
     System.out.println(count);
    }
}
    