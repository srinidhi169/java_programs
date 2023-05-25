//WAP to count total number of words in a string.
import java.util.Scanner;
public class NumOfWords{
  public static void main(String[] args){
    NumOfWords1 nw = new NumOfWords1();
    nw.countWords();
  }
}
class NumOfWords1{
  public void countWords(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String s1 = sc.nextLine();
    String words[] = s1.split(" ");
    int num_of_words = words.length;
    System.out.println("number of words are :"+num_of_words);
  }
}