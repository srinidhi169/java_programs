//emplyeee details
import java.util.Scanner;
public class Employee {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Emp e=new Emp();//constractor
    System.out.println("enter the details:");
    e.name=sc.nextLine();
    e.id=sc.nextInt();
    e.salary=sc.nextDouble();
    e.details();
    
  }
}
class Emp{
  String name;
  int id;
  double salary;
  public void details(){
    System.out.println("the details are:");
    System.out.println("employee name is:"+name);
    System.out.println("employee id is:"+id);
    System.out.println("employee salary is:"+salary);
  }
}