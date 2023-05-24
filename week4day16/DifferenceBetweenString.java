//write a java program to find the difference between number of characters of first word and last word in a string
import java.util.Scanner;

public class DifferenceBetweenString{
  public static void main(String[] args){
    All c= new All();
    c.difference();
  }
}

class All{
  public void difference(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String s = sc.nextLine();
    String[] w = s.split(" ");
    int first = w[0].length();
    int last = w[w.length-1].length();
   
    System.out.println("difference is "+(first-last));
  }
}