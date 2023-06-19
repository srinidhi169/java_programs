//prog to illustarte multilevel inheritance
class Person{
  String name;
  int id;
  static String OfficeName="bitlabs";
   public void does(){
     System.out.println("working");
   }
}
class Employee extends Person{
  String name="tahir";
  int id=1;
  String designation="learner";
}
class Manager extends Employee{
  String name="xyz";
  int id=2;
  String designation="manager";
  int experience=2;
}
public class Inheritence{
  public static void main(String[] args){
    System.out.println("employee details");
    Employee e1=new Employee();
    System.out.println("office "+Person.OfficeName);
    System.out.println("name "+e1.name);
    System.out.println("id "+e1.id);
    System.out.println("designation "+e1.designation);
    e1.does();
    System.out.println("manager details");
    Manager e2=new Manager();
    System.out.println("office "+Person.OfficeName);
    System.out.println("name "+e2.name);
    System.out.println("id "+e2.id);
    System.out.println("designation "+e2.designation);
    System.out.println("experience "+e2.experience);
      e2.does();
  }
}