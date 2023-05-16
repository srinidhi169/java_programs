//write a java program to print all strong numbers from 1 to n where n is an integer 
import java.util.Scanner;
 public class AllStrong{
  public static void main(String[] args){
    All s=new All();
    s.strong();
  }
}
class All{
  public void strong(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int digit,sum=0,fact=1;
    while(n>0){
      digit=n%10;
      for(int i=1;i<=n;i++){
	        fact=fact*i;
      }
      n=n/10;
	    sum=sum+fact;
    }
  }
}


