//Matrix Multiplication
import java.util.Scanner;
public class MatrixMultiplication{
public static void main(String[] args) {
    Array sn = new Array();
    sn.array();
  }
}

class Array {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of rows for A matrix");
    int m=sc.nextInt();
    System.out.println("enter the no of  columns for A matrix");
    int n=sc.nextInt();
    int A[][]=new int[m][n];
    System.out.println("enter the no of rows for B matrix");
    int p=sc.nextInt();
    System.out.println("enter the no of  columns for B matrix");
    int q=sc.nextInt();
    int B[][]=new int[p][q];
    int result[][]=new int[p][q];
     if(m==p && n==q){
    System.out.println("enter the A matrix elements:");
    for(int i=0;i<m;i++)
      for(int j=0;j<n;j++){
        A[i][j]=sc.nextInt();
      }
    System.out.println("enter the B matrix elements:");
    for(int i=0;i<p;i++)
      for(int j=0;j<q;j++){
        B[i][j]=sc.nextInt();
      }
   
      for(int i=0;i<p;i++){
      for(int j=0;j<q;j++){
        for(int k=0;k<q;k++){
         result[i][j]=A[i][j]*B[i][j];
        }
       }
      }
    }
    System.out.println("the resultent matrix is:");
    for (int i = 0; i <p; i++){
      for(int j=0;j<q;j++)
        System.out.print(result[i][j]+" ");
      System.out.println();
    }
  }
}