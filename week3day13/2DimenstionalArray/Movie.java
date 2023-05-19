import java.util.Scanner;
public class Movie{
  public static void main(String[] args) {
    Array sn = new Array();
    sn.array();
  }
}

class Array {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of movies:");
    int movies=sc.nextInt();
    System.out.println("enter the no of reviwers:");
    int reviewer=sc.nextInt();
    int sum=0,avg=0;
    int arr[][]=new int[reviewer][movies];
    System.out.println("enter the ratings:");
    for(int i=0;i<reviewer;i++)
      for(int j=0;j<movies;j++){
        arr[i][j]=sc.nextInt();
      }
    System.out.println("enter the elements of array");
    for (int i = 0; i <reviewer; i++){
      for(int j=0;j<movies;j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
    }
    for (int i = 0; i < reviewer; i++){
      for(int j=0;j<movies;j++){
        sum=sum+arr[i][j];
      }
    }
     System.out.println("the sum is: "+ sum);
    avg=sum/12;
    //avrage rating for the movies
    System.out.println("the avrage is: "+ avg);
    //maximum rating for movie one
    int max=0;
        for(int i = 0; i < reviewer; i++){
          if(max<arr[i][1])
            max = arr[i][1];
        }
    System.out.println("max review of movie1 is: "+max);
    
  }
}
     