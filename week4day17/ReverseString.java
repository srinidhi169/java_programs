
//write a java program to reverse each word at its place in a string                                                           Sample input: Learning made easy at bitLabs
//Expected output: gninraeL edam ysae ta sbaLtib
import java.util.Scanner;

class Reverse {
  public void string(String str) {
    String en = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      en = ch + en;
    }
    System.out.println("the reverse a string is:" + en);
  }
}

public class ReverseString {
  public static void main(String[] args) {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    str = sc.nextLine();
    Reverse call = new Reverse();
    call.string(str);
  }
}