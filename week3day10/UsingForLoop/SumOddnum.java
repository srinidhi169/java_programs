//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOddnum{
  public static void main(String[] args){
    Sum sn=new Sum();
    sn.sumOddNum();
  }
}
class Sum{
  public void sumOddNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
    
      if(i%2!=0){
            sum=sum+i;
      }

    }
    System.out.println("total sum of odd numbers is:"+sum);
  }
}