import java.util.Scanner;
public class SelectionSort{
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
    s.selectionSort(num, n);
  }
}


class Sort{
 public void selectionSort(int num[],int n){
   
   for(int i=0;i<n-1;i++){
     int index=i;
     for(int j=i+1;j<n;j++){
       if(num[j]<num[index]){
         index=j;
       }
       }
     int temp=num[index];
         num[index]=num[i];
         num[i]=temp;
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

