import java.util.*;
class Collections{
  public static void main(String[] args){
    ArrayList coll=new ArrayList();
    coll.add("Srinidhi");
    coll.add("1234");
    coll.add("bitlabs");
    coll.add("tekworks");
    System.out.println(coll);
    System.out.println(coll.size());
    ArrayList coll2=new ArrayList();
    coll2.add("nidhi");
    coll.addAll(coll2);
    System.out.println(coll2);
    System.out.println(coll.remove("1234"));
    System.out.println(coll);
    Iterator i= coll.iterator();
    while(i.hasNext()){
      System.out.println(i.next()+" ");
    }
  }
}