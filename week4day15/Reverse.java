//write a java program to reverse an array.
import java.util.Scanner;
public class Reverse{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
     System.out.println("the original array is:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+",");
    }
     System.out.println();
    
    All sn = new All();
    sn.array(arr,n);
    System.out.println("the reverse of the array is:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+",");
    }
   
  }
}
  class All{
   public int[] array(int[] arr,int n){
  int i,j;
   for(i=0,j=(n-1);i<j;i++,j--){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      
    }
    return arr;
   }
   
 }