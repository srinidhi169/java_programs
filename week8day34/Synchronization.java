//program that illustrates Thread Synchronization
//program that illustrates synchronized method
class Counter {
  int val = 0;

 

  synchronized void inc() {       //synchronized method
    val++;
  }

 

  synchronized void dcr() {       //synchronized method
    val--;
  }
}

 

 

public class Synchronization extends Thread {
  Counter c;

 

  Synchronization(Counter c) {
    this.c = c;
    start();
  }

 

  public void run() {
    for (int i = 0; i < 10000; i++)
      c.dcr();
  }

 

  public static void main(String args[]) throws Exception {
    Counter c = new Counter();
    Synchronization rc = new Synchronization(c);
    for (int i = 0; i < 10000; i++)
      c.inc();
    rc.join();
    System.out.println("Final value of c.val: " + c.val);
  }
}

 

 

/*When main thread executes, inc() on c, 
it owns c’s lock. Before finishing this method, the child thread cannot own the lock of c; therefore 
cannot execute dcr(). Similarly, when child thread executes dcr(), it owns the lock of c. During that 
time main thread waits. So, these methods are executed without any form of interleaving. However, 
we have no control whatsoever on the order these methods are executed. 
  */