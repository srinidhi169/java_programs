// WAP to print all natural numbers in reverse (from n to 100). -     using while loop
import java.util.Scanner;
public class ReverseFromN 
  {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
       
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}