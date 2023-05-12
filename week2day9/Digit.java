import java.util.Scanner;
public class Digit
{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    if((n>='0') || (n<='9'))
    {
      System.out.println(n + " is a digit");
    }
    else
    {
      System.out.println(n + " is not a digit");
    }
  }
}