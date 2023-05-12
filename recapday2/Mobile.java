/*you are purchasing a mobile from a shop. shop owner want to give discount
  if(cost>=100000) -----10% discount
  if(cost<100000 and cost>=50000) -----5% discount
  in all other cases-----2% discount

 

  20% GST will be added(on the actual price only)

 

you need to write a program to determine the total price of the mobile phone */
import java.util.Scanner;
public class Mobile
{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cost,amount,discount,gst;
    System.out.println("enter the cost");
    cost = sc.nextInt();
    if(cost>=100000){
      discount = (cost*10)/100;
      amount= cost-discount;
    }
    else if(cost>=50000){
      discount = (cost*5)/100;
       amount= cost-discount;
    }
    else{
      discount = (cost*2)/100;
       amount= cost-discount;
    }
    gst= amount+((20*cost)/100);
    System.out.println("final cost of  the mobile :" +gst);
  }
}