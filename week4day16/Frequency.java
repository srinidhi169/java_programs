//write a java program to find the frequency of characters of last word of a string
import java.util.Scanner;

public class Frequency {
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
    String[] words = s.split(" ");
    String last = words[words.length-1];
    int count=0;
    for(int i=0;i<last.length();i++){
      if(visit[i]==true)
        continue;
      else{
        count=1;
        for(int j=i+1;j<last.length();j++){
          if(last.charAt(i)==last.charAt(j)){
            visit[j]=true;
            count++;
          }
        }
         
      }
      System.out.println("frequency is "+last.charAt(i)+" is :"+count);
    }
  }
}