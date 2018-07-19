package idv.camille.assignment;

public class MyApplication {
	public static void main(String[] args) {
		// #1 Runnable
		
		//#2 Thread
		System.out.println("Thread:");
		MyThread mt = new MyThread(); /* main thread created the child thread*/
		mt.start();
		// anonymous subclass of thread
		Thread thread = new Thread(){
		    public void run(){
		      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		      System.out.println("Thread Running");
		    }
		  };

		  thread.start();
		
	}
}
