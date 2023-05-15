//WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class Even{
  public static void main(String[] args){
    Sum sn=new Sum();
    sn.sumEven();
  }
}
class Sum{
  public void sumEven(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.println("total sum of natural numbers is:"+sum);
    
  }
}