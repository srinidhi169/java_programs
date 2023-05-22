//write a java program to read an array and write that array in ascending order.
import java.util.Scanner;
public class Ascending{
  public static void main(String[] args) {
    All sn = new All();
    sn.array();
  }
}

class All {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int num[]=new int[n];
    int temp=0;
    System.out.println("enter the elements of array");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
     System.out.println("the original array is:");
    for(int i=0;i<n;i++){
      System.out.println(num[i]);
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
      if(num[i]>num[j]){
        temp=num[i];
        num[i]=num[j];
        num[j]=temp;
         }
      }
    }
    System.out.println("the ascending order of the array is:");
    for(int i=0;i<n;i++){
      System.out.print(num[i]+",");
    }
  }
}