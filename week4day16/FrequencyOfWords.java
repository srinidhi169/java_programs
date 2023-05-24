//write a java program to find the frequency of each word in a string
import java.util.Scanner;
public class FrequencyOfWords{
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
    int count=0;
    for(int i=0;i<words.length;i++){
      if(visit[i]==true)
        continue;
      else{
        count=1;
         for(int j=i+1;j<words.length;j++){
           if(words[i].equals(words[j])){
            visit[j]=true;
            count++;
          }
        }
         
       }
      System.out.println("frequency of "+words[i]+" is :"+count);
    }
  }
}

