//write a java program to find the frequency of each latter in a string
import java.util.Scanner;

public class FrequencyOfEach{
  public static void main(String[] args){
    All c= new All();
    c.stringFrequency();
  }
}

class All{
  public void stringFrequency(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String s = sc.nextLine();
    boolean visit[] = new boolean[s.length()];
    int count=0;
    for(int i=0;i<s.length();i++){
      if(visit[i]==true)
        continue;
      else{
         count=1;
        for(int j=i+1;j<s.length();j++){
          if(s.charAt(i)==s.charAt(j)){
            visit[j]=true;
            count++;
        }
         
      }
      System.out.println("frequency is "+s.charAt(i)+" is :"+count);
    }
  }
}