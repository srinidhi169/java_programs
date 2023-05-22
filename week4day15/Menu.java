
/*write a java program to read the array elements and then display the following menu.
1. find the sum of array elements
2. find the maximum and minimum elements
3. reverse the array elements 
4. find the prime elements of the array. now read the choice from the user and perform appropriate action*/
import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu2 sn = new Menu2();
    System.out.println("enter the size of an array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements of array");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("array is:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();

    System.out.println("enter your choice");
    System.out.println("1. find the sum of array elements");
    System.out.println("2. find the maximum and minimum elements");
    System.out.println("3. reverse the array elements");
    System.out.println("4. find the prime elements of the array");
    int ch = sc.nextInt();
    if (ch == 1) {
      sn.sum(arr, n);
    }
    if (ch == 2) {
      sn.minMax(arr, n);
      ;
    }
    if (ch == 3) {
      sn.reverse(arr, n);
    }
    if (ch == 4) {
      sn.prime(arr, n);
    }

  }
}

class Menu2 {
  public void sum(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
    }
    System.out.println("sum of array elements is:" + sum);
  }

  public void minMax(int[] arr, int n) {
    int min = arr[0], max = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("maximum element is:" + max);
    System.out.println("minimum elements is:" + min);
  }

  public void reverse(int[] arr, int n) {
    int i, j;
    for (i = 0, j = (n - 1); i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    System.out.println("the reverse of the array is:");
    for (int k = 0; k < n; k++) {
      System.out.print(arr[k] + ",");
    }
  }

  public void prime(int[] arr, int n) {
   boolean count = true;
    for (int i = 0; i <arr.length; i++) {
       
      if (arr[i] <= 1) 
        count=false;
       else {
          for (int j = 2; j < arr[i]/2; j++){
           if (arr[j] % j == 0){
              count=false;
               break;
           }
          }
         } 
        if (count) 
           System.out.println(arr[i]+ "is a prime num");
          break;
    }
      System.out.print("there r no prime numbers");
  }


  
}