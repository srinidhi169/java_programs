import java.util.*;
public class TreeExp2
  {
    public static void main(String[] args)
    {
      TreeSet<String> t = new TreeSet<String>();
      t.add("srinidhi");
      t.add("bitlabs");
      t.add("tekworks");
      System.out.println(t);
      t.remove("bitlabs");
      System.out.println(t);
    }
  }