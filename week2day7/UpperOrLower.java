//10. WAP to check whether a character is uppercase or lowercase     alphabet.
import java.util.Scanner;

public class UpperOrLower {
  public static void main(String args[]) {
    char ch;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any  character");
    ch = s.next().charAt(0);
    if ((ch >= 'a') && (ch <= 'z'))
    {
      System.out.println(ch + "is an lowercase alphabet");
    }
    else if ((ch >= 'A') && (ch <= 'Z'))
    {
      System.out.println(ch + "is an uppercase alphabet");
    }
    else{
      System.out.println(ch + " is not an alphabet,enter an alphabet");
    }
  }
}