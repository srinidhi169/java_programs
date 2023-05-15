//WAP to enter a number and print reverse of the number
import java.util.Scanner;
public class Reverse
{
  public static void main(String[] args){
    Digit sc=new Digit();
    sc.reverseNum();
  }
}
 class Digit{
  public void reverseNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    do{
       int digit=n%10;
       int rev=0;
	     rev=rev+digit;
       System.out.print(rev);
       n=n/10;
    }while(n!=0);
   
  }
}