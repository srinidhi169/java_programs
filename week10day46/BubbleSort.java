import java.util.Scanner;
public class BubbleSort{
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
    s.bubbleSort(num, n);
  }
}


class Sort{
 public void bubbleSort(int num[],int n){
   for(int i=0;i<n-1;i++){
     for(int j=0;j<n-1;j++){
       if(num[j]>num[j+1]){
          int temp=num[j];
          num[j]=num[j+1];
          num[j+1]=temp;
       }
     }
   printArray(num,n);
   }
    
 }

  
 static void printArray(int num[],int n){
  System.out.println("The sorted array is:");
    for(int i=0;i<n;i++)
      System.out.print(num[i]+",");
      System.out.println();
    
  }
}
