// /Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9.X can be placed before L (50) and C (100) to make 40 and 90.C can be placed before D (500) and M (1000) to make 400 and 900.
// Given an integer, convert it to a roman numeral.
 
// Example 1:
// Input: num = 3
// Output: "III"
// Explanation: 3 is represented as 3 ones.
// Example 2:
// Input: num = 58
// Output: "LVIII"
// Explanation: L = 50, V = 5, III = 3.
// Example 3:
// Input: num = 1994
// Output: "MCMXCIV"
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


import java.util.Scanner;
class Roman{
  public static void main(String[] args){
    int division=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    while(a>1){
      if(a>=1000){
        division=a/1000;
        while(division>0){
          System.out.print("M");
          division--;
        }
        a=a%1000;
       
      }
      else if(a>=900){
        division=a/900;
        while(division>0){
          System.out.print("CM");
          division--;
        }
        a=a%900;
      }
      else if(a>=500){
        division=a/500;
        while(division>0){
          System.out.print("D");
          division--;
        }
       a=a%500;
      }
      else if(a>=100){
        division=a/100;
        while(division>0){
          System.out.print("C");
          division--;
        }
      a=a%100;
      }
      else if(a>=90){
        division=a/90;
        while(division>0){
          System.out.print("XC");
          division--;
        }
        a=a%90;
      }
      else if(a>=50){
        division=a/50;
        while(division>0){
          System.out.print("L");
          division--;
        }
       a=a%50;
      }
      else if(a>=40){
        division=a/40;
        while(division>0){
          System.out.print("XL");
          division--;
        }
        a=a/40;
      }
      else if(a>=10){
        division=a/10;
        while(division>0){
          System.out.print("X");
          division--;
        }
        a=a/10;
      }
      else if(a>=9){
        division=a/9;
        while(division>0){
          System.out.print("IX");
          division--;
        }
        a=a/9;
      }
      else if(a>=5){
        division=a/5;
        while(division>0){
          System.out.print("X");
          division--;
        }
       a=a/5;
      }
      else if(a>=4){
        division=a/4;
        while(division>0){
          System.out.print("IV");
          division--;
        }
        a=a/4;
      }
      else{
        division=a;
        while(division>0){
          System.out.print("I");
          division--;
        }
        a=0;
      }
    }
  }
}