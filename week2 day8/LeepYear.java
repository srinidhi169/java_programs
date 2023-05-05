import java.util.Scanner;

class LeepYear {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year");
	int n =sc.nextInt();
	if(n%4!=0){
  	     print("n is not a leap year");
            }
	else if(n%4=0)
	{
	if(n%4=0 && n%100!=0){
		print("it is not leap year");
		}
	else if(n%4=0 && n%100=0)
		{
		if(n%400=0)
			print("it is a leap year");
		}
	}
}
}
