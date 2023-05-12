//assume that there are 500,200 and 100 notes are there in the ATM. write a java program to find the minimum number of notes to be dispensed for the requested amount using conditionals only . do not use loops
import java.util.Scanner;
public class Atm{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min=0,notes;
    System.out.println("enter the amount");
    int amount = sc.nextInt();
    if(amount>100)
    {
      if(amount>=500)
      {
        notes = amount/500;
        min= min+notes;
        amount = amount%500;
      }
      if(amount>=200)
      {
        notes = amount/200;
        min= min+notes;
        amount = amount%200;
      }
      if(amount>=100)
      {
        notes = amount/100;
        min = min+notes;
        amount = amount%100;
      }
      System.out.println("minimum notes are:"+min);
    }
    else
      System.out.println("amount is less then 100rs");
  }
}