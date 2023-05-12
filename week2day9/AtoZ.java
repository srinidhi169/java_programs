//19. WAP to print all alphabets from a to z. - using while loop 
import java.util.Scanner;
public class AtoZ
  {
    public static void main(String[] args)
    {
      char c='a';
      while((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
        System.out.print(c );
        c++;
      }
    }
  }