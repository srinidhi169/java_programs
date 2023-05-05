import java.util.Scanner;
public class Game {​​​​​​​
  public static void main(String[] args) {​​​​​​​
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the player1 move:");
    System.out.println("1.Rock 2.Paper 3.Scissors");
    int player1=sc.nextInt();
    System.out.println("Enter the player2 move:");
    System.out.println("1.Rock 2.Paper 3.Scissors");
    int player2=sc.nextInt();
    if(player1==1 && player2==3)
    {​​​​​​​
      System.out.println("Player 1 wins");
    }​​​​​​​
    else if(player1==2 && player2==1)
    {​​​​​​​
      System.out.println("Player 1 wins");
    }​​​​​​​
    else if(player1==3 && player2==2)
    {​​​​​​​
      System.out.println("Player 1 wins");
    }​​​​​​​
    else if(player2==1 && player1==3)
    {​​​​​​​
      System.out.println("Player 2 wins");
    }​​​​​​​
    else if(player2==2 && player1==1)
    {​​​​​​​
      System.out.println("Player 2 wins");
    }​​​​​​​
    else if(player2==3 && player1==2)
    {​​​​​​​
      System.out.println("Player 2 wins");
    }​​​​​​​
    else
    {​​​​​​​
      System.out.println("tie");
    }​​​​​​​
  }     
  ​​​​​​
}​​​​​​​

  