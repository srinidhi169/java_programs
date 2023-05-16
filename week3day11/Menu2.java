import java.util.Scanner;
class ExerciseMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Exercise e = new Exercise();
    boolean ch = true;
    int num;
    while (ch) {
      System.out.println("********MENU********");
      System.out.println(
          "1.check whether number is odd\n2.check whether number is even\n3.check whether number is prime\n4.check whether number is perfect\n5.quit");
      System.out.println("enter your choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("enter the number");
          num = sc.nextInt();
          boolean b = e.isEven(num);
          if (b == false) {
            System.out.println(num + "is odd");
          }else {
            System.out.println(num + "is not odd");
          }
          break;
        case 2:
          System.out.println("enter the number");
          num = sc.nextInt();
          boolean b1 = e.isEven(num);
          if (b1 == true) {
            System.out.println(num + "is even");
          }else {
            System.out.println(num + "is not even");
          }
          break;
        case 3:
          System.out.println("enter the number");
          num = sc.nextInt();
          boolean b2 = e.isPrime(num);
          if (b2 == true) {
            System.out.println(num + "is prime");
          } else {
            System.out.println(num + "is not prime");
          }
          break;
        case 4:
          System.out.println("enter the number");
          num = sc.nextInt();
          boolean b3 = e.isPerfect(num);
          if (b3 == true) {
            System.out.println(num + "is perfect");
          } else {
            System.out.println(num + "is not perfect");
          }
          break;
        case 5:
          ch = false;
      }
      
    }
    System.out.println("end of the program");
  }
}
class Exercise {
  public boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    }else {
      return false;
    }
  }
  public boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0)
        return false;
    }
    return true;
  }
  public boolean isPerfect(int number) {
    int sum = 0, i;
    for (i = 1; i < number; i++) {
      if (number % i == 0)
        sum = sum + i;
    }
    if (sum == number) {
      return true;
    }else {
      return false;
    }
  }
}
 
