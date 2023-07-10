import java.util.*;
class Employee
  {
    private static int nextId=1;
    private int id;
    private String employeeName;
    private double salary;
    private String company;
    private String dateOfJoining;
    private int age;
    private String gender;
    private String address;
    public Employee(String employeeName,double salary,String company,String dateOfJoining,int age,String gender,String address)
    { this.id=nextId++;
      this.employeeName=employeeName;
      this.salary=salary;
      this.company=company;
      this.dateOfJoining=dateOfJoining;
      this.age=age;
      this.gender=gender;
      this.address=address;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
  }
class Operation
  {
    HashMap<Integer,Employee> h = new HashMap<Integer,Employee>();
    public void getEmployeeDetails(Employee m)
    {
      h.put(m.getId(),m);
      System.out.println("employee details added sucessfull");
    }
    public void getAllEmployeeDetails()
    {
      boolean b = h.isEmpty();
      if(b==false)
      { 
for(Employee e:h.values())
  {
    System.out.println("Employee id = "+e.getId());
    System.out.println("Employee name ="+e.getEmployeeName());
    System.out.println("company = "+e.getSalary());
    System.out.println("Date of joining = "+e.getDateOfJoining());
    System.out.println("age = "+e.getAge());
    System.out.println("Gender = "+e.getGender());
                System.out.println("address ="+e.getAddress());
    
  }
      }
      else
      {
        System.out.println("Employee not found");
      }
    }
    public void getEmployeeById(int id)
    {
     Employee e = h.get(id);
      if(e!=null)
      {
        System.out.println("Employee id = "+e.getId());
       System.out.println("Employee name ="+e.getEmployeeName());
    System.out.println("company = "+e.getSalary());
    System.out.println("Date of joining = "+e.getDateOfJoining());
    System.out.println("age = "+e.getAge());
    System.out.println("Gender = "+e.getGender());
                System.out.println("address ="+e.getAddress()); 
      }
      else  
      {
        System.out.println("Employee not found");
      }
    }
    public void getEmployeeByName(String name)
    {
      int k=0;
      for(Employee e:h.values())
        {
          if(e.getEmployeeName().equalsIgnoreCase(name))
          {
          System.out.println("Employee id = "+e.getId());
       System.out.println("Employee name ="+e.getEmployeeName());
    System.out.println("company = "+e.getSalary());
    System.out.println("Date of joining = "+e.getDateOfJoining());
    System.out.println("age = "+e.getAge());
    System.out.println("Gender = "+e.getGender());
    System.out.println("address ="+e.getAddress()); 
            k++;
          }
        }
      if(k==0)
      {
        System.out.println("employee not found");
      }
    }
    public void deleteEmployee(int id)
    { 
  int   k=0;
      Employee e = h.remove(id);
      if(e!=null)
      {
       System.out.println("Employee id = "+e.getId());
       System.out.println("Employee name ="+e.getEmployeeName());
    System.out.println("company = "+e.getSalary());
    System.out.println("Date of joining = "+e.getDateOfJoining());
    System.out.println("age = "+e.getAge());
    System.out.println("Gender = "+e.getGender());
                System.out.println("address ="+e.getAddress());  
        System.out.println("----Deleted----");
        k++;
      }
if(k==0)

         System.out.println("employee not found"); 
    }
    }
  

public class Employeemain
  {
    public static void main(String[] args)
    {
      Operation op=new Operation();
      Scanner sc = new Scanner(System.in);
      
       while(true)
        { 
      System.out.println("==========================");
      System.out.println("Welcome to Employee Managenment System");
        System.out.println("==========================");
      System.out.println("1.upload employee details\n2.display all the employee details\n3.display employee by ID\n4.display employee by name\n5.delete employee detail");
          System.out.println("==========================");
          System.out.println("choose the operation to be performed");
          System.out.println("==========================");
      int choise = sc.nextInt();
     
          switch(choise)
            {
              case 1 :
                 System.out.println("Employee details");
          System.out.println("-------------------");
                System.out.print("Employee name = ");
                sc.nextLine();
                String employeeName = sc.nextLine();
                System.out.print("Employee salary = ");
                double salary = sc.nextDouble();
                System.out.print("company = ");
                sc.nextLine();
                String company = sc.nextLine();
                System.out.print("Date of joining = ");
                String dateOfJoining = sc.nextLine();
                System.out.print("age = ");
                int age = sc.nextInt();
                System.out.print("Gender = ");
                sc.nextLine();
                String gender = sc.nextLine();
                System.out.print("address =");
                String address = sc.nextLine();
                
Employee emp = new Employee(employeeName,salary,company,dateOfJoining,age,gender,address);
                op.getEmployeeDetails(emp);
                break;
              case 2 :
                op.getAllEmployeeDetails();
                break;
              case 3 :
                System.out.print("Enter the Id = ");
                int id =sc.nextInt();
                op.getEmployeeById(id);
                break;
              case 4 :
                System.out.print("Enter the name = ");
                String name = sc.nextLine();
                sc.nextLine();
                op.getEmployeeByName(name);
              case 5 : 
                System.out.print("enter Id =");
                int id1 = sc.nextInt();
                op.deleteEmployee(id1);
                
                
            }
        }
    }
  }