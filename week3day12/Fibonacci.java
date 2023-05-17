//write a java to print the fibonacci serirs
import java.util.Scanner;
 class Fibo{
  public void fibonacci(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    int a=0,b=1,c;
    System.out.print(a+" "+b+" ");
    for (int i=2;i<=n;i++){
      c=a+b;
      System.out.print(c+"  ");
      a=b;
      b=c;
    }
    
    System.out.println("fibonacci series up to " +n+  " numbers:");
  }
}
    public class Fibonacci{
    public static void main(String[] args){
    Fibo call=new Fibo();
    call.fibonacci();
   
    }
}