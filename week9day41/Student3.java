import java.util.*;
class Student{
  String name;
  double marks;
  
  Student(String name,double marks){
    this.name=name;
    this.marks=marks;

  }
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getMarks() {
    return marks;
}
public void setMarks(double marks) {
    this.marks = marks;
}
  public String toString(){
    return this.name+" "+this.marks;
  }
}
class MyComparator4 implements Comparator<Student>{
  public int compare(Student s1,Student s2){
    if(s1.marks<s2.marks)
      return 1;
    else if(s1.marks>s2.marks)
      return -1;
    else
      return 0;


  }
}
public class Student3{
  public static void main(String [] args){
    TreeMap<Student,String> t=new TreeMap<Student,String>(new MyComparator4());
    Student st1=new Student("Srinidhi",90);
    Student st2=new Student("nidhi",45);
    
    t.put(st1,"s");
    t.put(st2,"B");
   
    System.out.println(t);



  }
}