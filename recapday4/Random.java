//write a java program to generate a random integer and also read an integer from the user and print matched if both are matched else print not matched
import java.util.*;
import java.lang.Math;
public class Random {
  public static void main(String[] args){
    Test call= new Test();
    call.randomInteger();
  }
}



class Test { 
  public void randomInteger(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an integer");
    int x=sc.nextInt();
    int y=Math.random(y);
    System.out.println(y);
    if(x==y){
      System.out.println("mathched");
    }
    else{
       System.out.println("not matched");
    }
  }
}
    
    