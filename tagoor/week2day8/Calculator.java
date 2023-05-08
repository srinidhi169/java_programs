///WAP to read two integers and an operator(arithmetic) and prints the result
 
import java.util.Scanner;
 
public class Calculator2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    char operator;
    System.out.println("enter two integers");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    System.out.println("enter an operator");
    operator = sc.next().charAt(0);
    switch (operator) {
      case '+':
        System.out.println("addition:" + (num1 + num2));
        break;
      case '-':
        System.out.println("substraction:" + (num1 - num2));
        break;
      case '*':
        System.out.println("multiplication:" + (num1 * num2));
        break;
      case '/':
        System.out.println("division:" + (num1 / num2));
        break;
      case '%':
        System.out.println("modulus:" + (num1 % num2));
        break;
      default:
        System.out.println("enter arithmetic operator only");
        break;
    }
 
  }
}