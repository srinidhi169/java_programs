//string palindrom
import java.util.Scanner;
public class StringPalindrom{
  public static void main(String[] args){
  Word l= new Word();
    l.isPalindrom ();
  }
}

class Word{
  public void isPalindrom(){
    String palindrom="";
    String result="";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.nextLine();
    String str2 = "";
    for(int i=(str.length()-1);i>=0;i--){
      str2=str2+str.charAt(i);
      if(str.equals(str2)){
        result=result+str2;
      }
       System.out.println(result);
    }
  }
}
      