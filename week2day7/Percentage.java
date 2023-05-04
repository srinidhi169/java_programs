//WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    //Percentage >= 90% : Grade A
    //Percentage >= 80% : Grade B
    //Percentage >= 70% : Grade C
    //Percentage >= 60% : Grade D
    //Percentage >= 40% : Grade E
   // Percentage < 40% : Grade F
import java.util.Scanner;
public class Percentage
{
    public static void main(String args[])
    {        
        Scanner s=new Scanner(System.in);
        System.out.println("enter 5 subject marks");
        System.out.println("enter physics marks:");
        int Marks1=s.nextInt();
        System.out.println("enter chemistry marks:");
        int Marks2=s.nextInt();
        System.out.println("enter maths marks:");
        int Marks3=s.nextInt();
        System.out.println("enter biology marks:");
        int Marks4=s.nextInt();
        System.out.println("enter computer marks:");
        int Marks5=s.nextInt();


        float Percentage=(Marks1+Marks2+Marks3+Marks4+Marks5)/5;
        System.out.println("percentage:"+Percentage);
        
        if(Percentage >= 90)
        {
          System.out.println("Grade A");
         }        
        else if(Percentage >= 80)
        {
          System.out.println("Grade B");
         }
        else if(Percentage >= 70)
        {
          System.out.println("Grade C");
        }
        else if(Percentage >= 60)
        {
          System.out.println("Grade D");
        }
        else if(Percentage >= 40) 
        {
          System.out.println("Grade E");
        }
        else if(Percentage < 40) 
        {
          System.out.println("Grade F");
        }
    
    }
}

