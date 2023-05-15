//WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class SumEvennum{
  public static void main(String[] args){
    Sum sn=new Sum();
    sn.sumEvenNum();
  }
}
class Sum{
  public void sumEvenNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=0;
    for (int i=2;i<=n;i++){
      if(i%2==0){
            sum=sum+i;
      }
     
    }  
    System.out.println("total sum of even numbers is:"+sum);
  }
}