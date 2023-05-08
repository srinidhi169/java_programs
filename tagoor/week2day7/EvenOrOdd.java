//wap to chack the number is even or odd
import java.util.Scanner;
public class EvenOrOdd
{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of a");
   int a = sc.nextInt();
   if(a%2==0)
   {
     System.out.println(a +" is even number");
   }
  if(a%2!=0)
   {
     System.out.println(a +" is odd number");
   }
}
}
