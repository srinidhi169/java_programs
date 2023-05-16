//29. WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Palindrom
{
  public static void main(String[] args){
    Digit s=new Digit();
    s.isPalidrom();
  }
}
 class Digit{
  public void isPalidrom(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int temp=n;
    int revnumber=0,digit;
    while(n!=0){
      digit=n%10;
      revnumber=(revnumber*10)+digit;
      n=n/10;
    }
    if(revnumber==temp){
    System.out.println(temp +"the number is palindrom");
    }
    else{
       System.out.println(temp +"the number is not palindrom");
    }
  }
}