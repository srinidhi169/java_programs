import java.util.Scanner;
public class BinarySearch{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    System.out.println("enter the elements of array in sorted order:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("enter the key element to be searched:");
    int key=sc.nextInt();
    int low=0;
    int high=n-1;
    Search l=new Search();
    int found=l.binarySearch(num,n,key,low,high);
    if(found==-1)
      System.out.println("no element found");
    else
      System.out.println("the key element is present at the index of:"+ found);
  }
}


class Search{
 public int binarySearch(int num[],int n,int key,int low,int high){
   while(low<=high){
   int mid=(low+high)/2;
    if(num[mid]==key)
      return mid;
    else if(key>num[mid])
      low=mid+1;
    else if(key<num[mid])
      high=mid-1;
    }
   return -1;
 }
}