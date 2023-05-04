//4. WAP to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
public class Div
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  int a;
  System.out.println("enter the value ");
   a = sc.nextInt();
  if(a%5==0&&a%11==0)
  {
    System.out.println(a + "is dividible by 5 and 11 ");
  }
  else
  {
    System.out.println(a + " is not dividible by 5 and 11 ");
  }
}
}