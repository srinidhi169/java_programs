//write a java program to find the largest palindrome substring in a string.
import java.util.Scanner;
public class LargestPalindrom{
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static String maxLength(String str1, String str2) {
        return (str1.length() > str2.length()) ? str1 : str2;
    }
    
    public static String findLargestPalindromeSubstring(String str) {
        String largestPalindrome = "";
        int maxLength = 0;
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    largestPalindrome = substring;
                    maxLength = substring.length();
                }
            }
        }
        
        return largestPalindrome;
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String input =sc.nextLine();
        String largestPalindrome = findLargestPalindromeSubstring(input);
        
        System.out.println("Input: " + input);
        System.out.println("Largest Palindrome Substring: " + largestPalindrome);
    }
}