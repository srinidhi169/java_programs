//25.WAP  to print multiplication table of any number
import java.util.Scanner;
public class MultiplicationTable
{
  public static void main(String[] args){
    int n,mul=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+ n*i);
    }
  }
}