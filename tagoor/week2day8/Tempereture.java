import java.util.Scanner;

class Tempereture {
  public static void main(String[] args) {
    float f,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number \n 1.Fahrenheit to celsius\n 2. celsius to Fahrenheit");
    int ch=sc.nextInt();
    switch(ch)
    {
     case 1:System.out.println("enter the Fahrenheit temperature");
            f =sc.nextFloat();
	          c=(f-32)*5/9;
	          System.out.println("celsisus tempereture is " +c);
            break;
     case 2:System.out.println("enter the celsisus temperature");
            c =sc.nextFloat();
            f=((9*c)/5)+32;
	          System.out.println("fahrenhit tempereture is " +f);
     }
  }
}