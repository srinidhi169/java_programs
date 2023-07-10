import java.util.*;
class Queue
  {
    public static void main(String args[])
    {
      PriorityQueue p=new PriorityQueue();
      p.add("x");
      p.offer("y");
      p.add("z");
      p.offer("a");
      p.add("b");
      p.offer("c");
      p.add("d");
      p.offer("e");
       System.out.println(p);
      System.out.println(p.remove());
       System.out.println(p);
       System.out.println(p.poll());
      System.out.println(p);
       System.out.println(p.peek());
       System.out.println(p);
       System.out.println(p.element());
       System.out.println(p);
    }

  }