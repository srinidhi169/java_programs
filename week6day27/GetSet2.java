class Ex1
  {
    public String name;
    public int id;
    public float salary;
    public void setName(String name)
    {
      this.name = name;
    }
     public void setId(int id)
    {
      this.id = id;
    }
     public void setSalary(float salary)
    {
      this.salary = salary;
    }
    public String getName()
    {
      return name;
    }
    public int getId()
    {
      return id;
    }
    public float getSalary()
    {
      return salary;
    }
  }

 


public class GetSet2
  {
    public static void main(String[] args)
    {
      System.out.println("details are");
      Ex1 e = new Ex1();
      e.name = "srinidhi k";
      e.id = 1;
      e.salary = 1000.0f;
      System.out.println("name = "+e.getName());
       System.out.println("id = "+e.getId());
       System.out.println("salary = "+e.getSalary());
    }
  }