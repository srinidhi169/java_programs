/*write a java program that reads a integer. you need to display a menu
 
   1. checking whether number is odd
   2. checking whether number is even
   3. checking whether number is prime
   4. checking whether number is perfect
   5. quit*/
import java.util.Scanner;
public class Menu{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your choice");
    System.out.println("1. checking whether number is odd");
    System.out.println("2. checking whether number is even");
    System.out.println("3. checking whether number is prime");
    System.out.println("4. checking whether number is perfect");
    System.out.println("5. quite");
    int ch=sc.nextInt();
    Sum sn=new Sum();
    if(ch==1){
      sn.oddNum();
    }
    if(ch==2){
      sn.evenNum();
    }
    if(ch==3){
      sn.primeNum();
    }
    if(ch==4){
      sn.perfectNum();
    }
    if(ch==5){
      sn.quite();
    }
    
  }
}


class Sum{
  public void oddNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    if(n%2!=0){
       System.out.println("the number is odd number");
    }else{
      System.out.println("the number is not odd number");
    }

  }

  
   public void evenNum()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    if(n%2==0){
       System.out.println("the number is even number");
    }
     else{
       System.out.println("the number is  not even number");
     }
   }

  
    public void primeNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
      if(n<=1){
         System.out.println("not prime number");
       }
      else if(n>=1){
        for(int i=2;i<n/2;i++)
         {
          if(n%i==0){
            System.out.println("not prime number");
           }
         }
      }
      else{
             System.out.println("prime number");
           }
           
         
      }
   }
   
  
    public void perfectNum(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int sum=0,i=1;
      while(i<n)
      {
        if(n%i==0)
        {
          sum=sum+i;
        }
        i=i+1;
      }
     if(sum == n){
        System.out.println("number is perfect number");
     }
     else{
       System.out.println("number is not perfect number");
     }
    
   }
     public  void quite(){
       System.out.println("quite");
    }
  
}