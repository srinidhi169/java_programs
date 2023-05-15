//WAJP to check a positive integer is prime r not.
import java.util.Scanner;
public class Prime{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     PrimeNum s=new PrimeNum();
     System.out.println("enter a number");
     int n=sc.nextInt();
     if(s.checkPrime(n)){
        System.out.println(n+ " :is a prime number");
     }
    else{
      System.out.println(n+" :is not a prime number");
    }  
  }
}
class PrimeNum{
  public boolean checkPrime(int n){
   if(n<=1){
     return false;
   }
    for(int i=2;i<n/2;i++)
      {
        if(n%i==0){
          return false;
        }
      }
    return true;
  }
}
