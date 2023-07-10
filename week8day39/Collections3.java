import java.util.*;
import java.util.Scanner;
class Employee{
  String name;
  int id;
  double sal;
  public void setname(String name){
    this.name=name;
  }
  
  public String getname(){
    return this.name;
  }

   public void setid(int id){
    this.id=id;
  }
  
  public int getid(){
    return this.id;
  }
  
   public void setsal(double sal){
    this.sal=sal;
  }
  
  public double getsal(){
    return this.sal;
  }
}


class Collections3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employee c1=new Employee();
    ArrayList a=new ArrayList();
    System.out.println("enter the employee detailes:");
    c1.setname(sc.nextLine());
    c1.setid(sc.nextInt());
    c1.setsal(sc.nextDouble());
    a.add(c1);
    
    Iterator i= a.iterator();
    while(i.hasNext()){
      System.out.print(i.next()+" ");
    }
  }
}