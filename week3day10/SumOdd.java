//WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class SumOdd{
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
    int sum=0,i=1;
    do{
      if(i%2!=0){
            sum=sum+i;
      }
      i++;
    }while(i<=n);
    System.out.println("total sum of odd numbers is:"+sum);
  }
}