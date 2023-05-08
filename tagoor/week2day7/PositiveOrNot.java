//3. WAP to check whether a number is negative, positive or zero.
import java.util.Scanner;
public class PositiveOrNot
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of a");
   int a = sc.nextInt();
   if(a>0)
   {
     System.out.println("a is positive ");
   }
  else if(a<0)
  { 
     System.out.println("a is negative ");
  }
   
 else if(a==0)
  {
    System.out.println( "a is equal to zero");
  }
}
}