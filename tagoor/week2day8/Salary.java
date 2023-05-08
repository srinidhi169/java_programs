import java.util.Scanner;
public class Salary
  {
    public static void main(String[] args)
    {
      int Basic_Salary;
        float hra,da;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Basic_Salary of employee:");
      Basic_Salary =sc.nextInt();
    
      if(Basic_Salary <= 10000)
        {
         hra=Basic_Salary*0.2f;
          da=Basic_Salary*0.8f;
        
        
        }
      else if(Basic_Salary <= 20000 )
        {
          hra=Basic_Salary*0.25f;
          da=Basic_Salary*0.9f;
        
        }
      else 
        {
        hra=Basic_Salary*0.3f;
          da=Basic_Salary*0.95f;
        
        }
      
      System.out.println("Gross salary:"+(Basic_Salary+hra+da));
        
      
    }
  }