//25.WAP  to print multiplication table of any number
import java.util.Scanner;
public class MultiplicationTable
{
   public static void main(String[] args){
   Multiplication sc= new Multiplication();
   sc.Table();
   }
}  

 class Multiplication {
  public void Table(){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    n=sc.nextInt();
    do{
      System.out.println(n+"*"+i+"="+ n*i);
      i++;
     }while(i<=10);
   
  }
}