import java.util.Scanner;
public class Age {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the income:");
    int income=sc.nextInt();
    System.out.println("Enter the age:");
    int age=sc.nextInt();
    if(income>50000 && age>23)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
}