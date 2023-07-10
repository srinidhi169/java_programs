/*Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message.

 

Here's a sample input and output for the above question:

 

-------------------------------------------------------------

 

Sample Input:

 

A = [23,45,67,78,86,90]

 

Target element is: 67

 

Expected Output:

 

67 is present in 2nd index position and it is a prime number*/
import java.util.Scanner;
class SearchBinaryPrime{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    System.out.println("enter the elements of array in sorted order:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("target element is:");
    int key=sc.nextInt();
    int low=0;
    int high=n-1;
    Search l=new Search();
    int found=l.binarySearch(num,n,key,low,high);
    if(found==-1)
      System.out.println("no element found");
    else 
      System.out.println("the key element is present at the index of:"+ found);
    int prime=l.primeOrNot(key);
  
    if(prime>=1)
      System.out.println("the searched element is prime number");
    else
      System.out.println("the searched element is not prime number");
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
  public int primeOrNot(int key){
    int count=0;
    if(key<=1)
      return count;
    else{
      for(int i=2;i<key/2;i++){
        if(key%i==0)
          return count;
          
      }
    }
    return count++;
  }
}