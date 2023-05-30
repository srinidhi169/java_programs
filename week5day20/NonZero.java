
    /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
import java.util.Scanner;
public class NonZero{
  public static void main(String[] args) {
    Number sn =new Number();
    sn.array();
  }
}

class Number{
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int nums[]=new int[n];
    System.out.println("enter the elements of array");
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
     System.out.println("the original array is:");
    for(int i=0;i<n;i++){
      System.out.print(nums[i]+" ");
    }
     System.out.println( );
  
    int count=0;
    System.out.println("after Sorting the array is:");
    for(int i=0;i<nums.length;i++){
      if(nums[i]!=0){
          nums[count++]=nums[i];
        }
    }
    while(count<n)
      nums[count++]=0;
    
    for (int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
  }
}

