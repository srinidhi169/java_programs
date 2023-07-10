class StackExp
  {
    public static void main(String []args)
    {
      Stack<String> s=new Stack<String>();
      s.push("koripi");
      s.push("mouni");
      s.push("srinivas");
      System.out.println(s);
      System.out.println(s.size());
    //  s.pop();
     System.out.println(s.peek());
     // System.out.println(s.size());
      s.push("mounika");
      System.out.println(s);
      System.out.println(s.search("mounika"));
      System.out.println(s.pop());
      System.out.println(s.peek());
       System.out.println(s.size());
    }
  }