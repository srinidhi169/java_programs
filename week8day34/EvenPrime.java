class MyThread1 implements Runnable
  {
    public void run(){
    System.out.println("the prime numbers are:");
     for(int i=1;i<=100;i++){
      int prime=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
          prime++;
      }

      if(prime==2)
      System.out.print(i+",");
    }
  }
}
public class EvenPrime
  {
    public static void main(String[] args)
    {
      MyThread1 t=new MyThread1();
      Thread c=new Thread(t);
      c.start();
      System.out.println("the enen numbers are:");
      for(int i=1;i<=100;i++)
        {
          if(i%2==0)
          System.out.print(i+",");
        }
    }
  }