import java.util.Scanner;
class Factorial1{
  public static void print(int n)
  {
    int fact=1;
    for(int i=1;i<=n;i++)
      {
        fact =fact*i;
      }
    System.out.println(fact);
    return;
  }
}
  
  public class Factorial{
    public static void main(String args[])
      {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the value");
      int n=sc.nextInt();
      Factorial1 call= new Factorial1();
      call.print(n);
      }
  }
