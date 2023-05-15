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
    int sum=0,i=1;
    do{
      sum=sum+i;
      i=i+1;
    }
     while(i<=n);
    System.out.println("total sum of natural numbers is:"+sum);
  }
}