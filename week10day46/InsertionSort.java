import java.util.Scanner;
public class InsertionSort{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    System.out.println("enter the elements of array:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    
    Sort s=new Sort();
    s.insertionSort(num, n);
  }
}


class Sort{
 public void insertionSort(int num[],int n){
   for(int i=0;i<n;i++){
     int key=num[i];
     int j=i-1;
     while(j>=0&&num[j]>key){
       num[j+1]=num[j];
       j=j-1;
     }
     num[j+1]=key;
     
   }
   
   printArray(num,n);
    
 }

  
 static void printArray(int num[],int n){
  System.out.println("The sorted array is:");
    for(int i=0;i<n;i++)
      System.out.print(num[i]+",");
      System.out.println();
    
  }
}
