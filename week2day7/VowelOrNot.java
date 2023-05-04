
//8. WAP to input any alphabet and check whether it is vowel or    consonant.
import java.util.Scanner;

public class VowleOrNot {
  public static void main(String args[]) {
    char ch;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any  character");
    ch = s.next().charAt(0);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
        || ch == 'O' || ch == 'U') {
      System.out.println(ch + "is a vowle");
    } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println(ch + "is a consonent");
    } else {
      System.out.println(ch + "is a special symbol");
    }
  }
}