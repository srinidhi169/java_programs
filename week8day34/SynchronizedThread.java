class Sync{
  int a=0;
  synchronized void add(){
    a++;
  }
  synchronized void sub(){
    a--;
  }
}
public class SynchronizedThread extends Thread{
  Sync s;
  SynchronizedThread(Sync s){
    this.s=s;
    start();

  }
  public void run(){
    for(int i=0;i<100;i++){
      s.sub();
    }
  }
    public static void main(String[] args) throws Exception {
      Sync s=new Sync();
      SynchronizedThread sc=new SynchronizedThread(s);
      for(int i=0;i<100;i++){
        s.add();
      }
      sc.join();

      System.out.println("value is "+s.a);
    }
}