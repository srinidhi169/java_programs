//60. WAP to delete an element from an array at specified position.
import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement{
  public static void main(String[] args) {
    Array sn = new Array();
    sn.array();
  }
}

class Array {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of array");
    for (int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
       }
    System.out.println("enter the position of an array to be deleted");
    int j=sc.nextInt();
    
      for (int i = 0,k=0; i<n; i++){
      if(arr[i]!=j){
        another[k]=arr[i];
        k++;
      }
      
    }
     System.out.println("the array before deleteing the element: "+Arrays.toString(arr));
    System.out.println("the array after deleteing the element: "+Arrays.toString(another));
   
   }
}
      