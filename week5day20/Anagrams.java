//write a java program to  check whether two strings are anagrams or not.
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams{
  public static void main(String[] args){
    All cd=new All();
    cd.isAnagram();
   
  }
}


class All{
  public void isAnagram(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two strings");
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    
    if(arr1.length==arr2.length){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    Boolean result=Arrays.equals(arr1,arr2);

    if(result)
      System.out.println("the 2 strings are anagrams");
    else
       System.out.println("the 2 strings are not anagrams");
  }
}
}