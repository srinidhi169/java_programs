//WAP to enter a number and print its reverse.
import java.util.Scanner;
public class Reverse2{
  public static void main(String[] args){
    RevNumber n=new RevNumber();
    n.Rev();
  }
}
class RevNumber{
  public void Rev(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    int revnumber=0,digit;
    do{
      digit=a%10;
      revnumber=(revnumber*10)+digit;
      a=a/10;
    }
      while(a>0);
    System.out.println("reverse number is:"+revnumber);
  }
}