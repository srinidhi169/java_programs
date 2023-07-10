import java.util.Scanner;
public class BinarySearchString{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size :");
    int n=sc.nextInt();
    String num[]=new String[n];
    System.out.println("enter the strings:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextLine();
    }
    System.out.println("enter the string to be searched:");
    String key=sc.nextLine();
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
 public int binarySearch(String num[],int n,String key,int low,int high){
   while(low<=high){
   int mid=(low+high)/2;
    int s=key.compareTo(num[mid]);
    
    if(s>0)
      low=mid+1;
    else if(s<0) 
      high=mid-1;
    else if(s==0)
      return mid;
    }
   return -1;
 }
}