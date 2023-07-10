import java.util.*;
class TreeExp4{
    public static void main(String []args){
      TreeSet t=new TreeSet(new MyComparator());
      t.add("sri");
      t.add("nidhi");
      t.add("bitlabs");
      t.add("tekworks");
      System.out.println(t);
     }
  }
class MyComparator implements Comparator
  {
    public int compare(Object obj1,Object obj2)
    {
      String s1=(String)obj1;
      String s2=(String)obj2;
      return s1.compareTo(s2);
    }
  }