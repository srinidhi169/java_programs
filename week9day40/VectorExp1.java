import java.util.*;

public class VectorExp1{
  public static void main(String[] args){
    int n=100;
    Vector<String> v=new Vector<String>(n);
    v.addElement("A");
    v.addElement("B");
    v.addElement("C");
    v.addElement("D");
    System.out.println(v);
    v.remove(3);
    System.out.println(v);
    System.out.println(v.size());
    v.setSize(5);
    System.out.println(v.size());
    System.out.println("Capacity is "+v.capacity());
    Enumeration e=v.elements();
    System.out.println("\nElements are:");
    
    while(e.hasMoreElements())
          System.out.println(e.nextElement());
  }
}
    