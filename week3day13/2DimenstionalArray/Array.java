import java.util.Scanner;

public class Array{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int arr[][]= new int[3][4];
    System.out.println("enter the array elements");
    for(int i=0;i<3;i++)
      for(int j=0;j<4;j++){
        arr[i][j]=sc.nextInt();
      }
 
    System.out.println("the array elements are");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
    }
    System.out.println("the no. of rows are: " +arr.length); //no.of rows
    System.out.println("the number of colums are:" +arr[0].length); //no.of elements in each row
 
    
    
  }
 
  
}