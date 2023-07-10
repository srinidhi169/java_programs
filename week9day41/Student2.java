import java.util.*;
class Student{
  private String name;
  private int marks;

 

  public Student(String name,int marks){
    this.name=name;
    this.marks=marks;
  }
  public String getName(){
    return name;
  }
  public int getMarks(){
    return marks;
  }

 

public String toString(){
  return "Student[name="+name+ ", marks="+marks+"]";
}
}
class MarksComparator implements Comparator<Student>{
  public int compare(Student s1,Student s2){
    if(s1.getMarks()<s2.getMarks()){
      return 1;
    }
    else if(s1.getMarks()>s2.getMarks()){
      return -1;
    }
    return 0;
  }
}
public class Student2{
  public static void main(String[] args){
    TreeMap<Student,String> ts=new TreeMap<Student,String>(new MarksComparator());
    ts.put(new Student("avhr",89),"A");
    ts.put(new Student("abc",79),"B");
    ts.put(new Student("xyz",59),"C");
    System.out.println(ts);

 

    Set entries=ts.entrySet();
    for(Object o:entries){
      Map.Entry e=(Map.Entry)o;
      System.out.print("key is:"+e.getKey()+" value is:");
      System.out.println(e.getValue());
    }
  }
}