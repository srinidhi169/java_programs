class Organization{
  String o_name="tekworks";
}


class Employee extends Organization {
  String name="srinidhi k";
  void does(){
    System.out.print("works");
  }
}

class Trainer extends Organization{
  String T_name="pavan";
}

public class Inheritence {
  public static void main(String args[]){
    Organization obj=new Organization();
    Trainer c=new Trainer();
    Employee e=new Employee();
    System.out.println("the eployess are:");
    System.out.println(e.name);
    System.out.println(c.T_name);
    e.does();
    System.out.println(" in "+ obj.o_name);
  }
}