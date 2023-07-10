class EmployeeDetails{
  String name;
  int id;
  static String company="Tekworks";
  EmployeeDetails(String n,int i){
    name=n;
    id=i;
  }
   static void change(){
     company="bitLbs";
   }
   void show(){
     System.out.println(name+" "+id+" "+company);
   }
}
public class Static{
  public static void main(String args[]){
    EmployeeDetails e1=new EmployeeDetails("sri",1);
    EmployeeDetails e2=new EmployeeDetails("nidhi",2);
    e1.show();
    e2.show();
    EmployeeDetails.change();
    e1.show();
    e2.change();
    e2.show();
  }
}