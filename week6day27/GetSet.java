public class GetSet{
  public static void main(String[] args){
    Emp e = new Emp();
    e.setname("sri");
    System.out.println("the name is:"+e.getname());
  }
}
class Emp{
  String name;
  public void setname(String name){
    this.name=name;
  }
  
  public String getname(){
    return this.name;
  }
  
}