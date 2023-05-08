import java.util.Scanner;
public class Example2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float p,t,r,si ;
  System.out.println("enter the value of principal amount");
  p = sc.nextFloat();
  System.out.println("enter the time");
  t = sc.nextFloat();
  System.out.println("enter the rate of interest");
  r = sc.nextFloat();
  si = (p*t*r)/100;
  System.out.println("SimpleIntrest is" +si);
}
}