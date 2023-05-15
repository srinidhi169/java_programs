//2. write a java program to find sum of all prime numbers from 1 to n
import java.util.Scanner;
public class SumPrime{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int n=sc.nextInt();
     Prime s=new Prime();
     s.checkPrime(n);
  }
}

class Prime{
  public void checkPrime(int n){
    int sum=0;
    if(n<=1){
          sum=0;
          System.out.println("their are no prime numbers:" +sum);
        }
    else if(n>1){
     for(int i=2;i<n;i++)
      {
        if(n%i!=0){
                sum=sum+i;
        }
      }
       System.out.println("the sum of prime numbers is:" +sum);
    }
   }
}



