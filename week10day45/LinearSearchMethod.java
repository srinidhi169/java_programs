import java.util.Scanner;
public class LinearSearchMethod{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    System.out.println("enter the elements of array:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("enter the key element to be searched:");
    int key=sc.nextInt();
    LinearSearch l=new LinearSearch();
    int found=l.search(num,n,key);
    if(found==-1)
      System.out.println("no element found");
    else
      System.out.println("the key element is present at the index of:"+ found);
  }
}


class LinearSearch{
 public static int search(int num[],int n,int key){
   for(int i=0;i<n;i++){
      if(key==num[i])
         return i;
    }
   return -1;
 }
}






