public class Employee1{
  public static void main(String[] args){
    Emp e = new Emp();
    e.name = "srinidhi";
    e.id = 1;
    e.salary = 10000;
    e.printDetails();
    
  }
}
class Emp{
  String name;
  int id;
  double salary;
  public void printDetails(){
    System.out.println("name : "+name);
    System.out.println("id : "+id);
    System.out.println("salary : "+salary);
  }
}