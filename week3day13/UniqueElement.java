//58. WAP to print all unique elements in the array.
import java.util.Scanner;
public class UniqueElement{
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
    int arr[]=new int[n];
    System.out.println("enter the elements of array");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count=0;
    System.out.println("element\t\tcount");
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (visited[i] == true)
        continue;
        count = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          visited[j] = true;
        }
      }
      System.out.println(arr[i] + "\t\t" + count);
     }
    System.out.println("the unique elements are:");
    for (int k= 0; k < n; k++) {
      if (visited[k] == false){
        System.out.println(arr[k]);
      }
      
    }
   
 
  }
}