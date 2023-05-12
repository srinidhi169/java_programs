/* Given an integer, , perform the following conditional actions:
 
If  is odd, print Weird
If  is even and in the inclusive range of  2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20 , print Weird
If  is even and greater than 20 , print Not Weird*/
import java.util.Scanner;
public class Integer {
  public static void main(String[] args){
    Range call=new Range();
    call.even();
  }
}
    
class Range{
 public void even(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an integer");
    int x=sc.nextInt();
    if(x%2!=0){
       System.out.println("werid");
    }
    else if(x%2==0 && (x>=2 && x<=5)){
       System.out.println("Not werid ");
    }
    else if(x%2==0 && (x>=6 && x<=20)){
       System.out.println(" werid ");
    }
    else if(x%2==0 && (x>20)){
       System.out.println("not werid ");
    }
  }
}