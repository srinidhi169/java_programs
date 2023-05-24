//write a java program to reverse the string and check whether it is palindrome or not
import java.util.Scanner;

public class Palindrom{
  public static void main(String[] args){
    All c= new All();
    c.isPalindrom();
  }
}

class All{
  public void isPalindrom(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String s = sc.nextLine();
    String rev="";
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      rev=ch+rev;
    }
    boolean b=rev.equals(s);
    if(b)
      System.out.println("The given string is a palindrome");
    else
      System.out.println("The given string is not a palindrome");
  }
}