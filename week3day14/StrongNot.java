import java.util.Scanner;
public class StrongNot{
  public static void main(String[] args){
    StrongOr_Not son = new StrongOr_Not();
    son.isStrong();
    
    
  }
}
  

  class StrongOr_Not{
    public void isStrong(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
      int digit,sum=0;
      int dup_num=num;
    while(num!=0)
      {
        digit = num%10;
        int j=1,factorial=1;
        while(j<=digit)
          {
            factorial = factorial*j;
            j++;
          }
        sum = sum+factorial;
        num = num/10;
      }
      if(sum==dup_num)
        System.out.println("Strong num");
      else
        System.out.println("not a Strong num");
          
    }
  }