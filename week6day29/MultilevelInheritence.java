class Car{
  public void vehicleType(){
    System.out.println("vehicle type:car");
  }
}
class Maruthi extends Car{
  public void brand(){
    System.out.println("maruthi");
  }
}
class Maruthi800 extends Maruthi{
  public void type(){
    System.out.println("maruthi800");
  }
}
public class MultilevelInheritence extends Maruthi800{
  public static void main(String args[]){
    Maruthi800 obj=new Maruthi800();
    obj.vehicleType();
    obj.brand();
    obj.type();
  }
}
    