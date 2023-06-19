public class ExampleStatic {
  public static void main(String[] args) {
    Emp e = new Emp();
    e.name = "srinidhi k";
    e.id = 8;
    Emp.c_name = "cbit";
    e.display();
    Emp.change();
    e.display();
  }
}

class Emp {
  String name;
  int id;
  static String c_name;

  static void change() {
    c_name = "Sahyadri";
  }
  public void display() {
    System.out.println(name);
    System.out.println(id);
    System.out.println(Emp.c_name);

  }
}