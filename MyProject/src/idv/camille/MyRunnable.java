package idv.camille;

import java.util.Date;

public class MyRunnable implements Runnable{

	
	public void run() {
		System.out.println(MyRunnable.class.getName()+ ":" +Thread.currentThread().getName());
		
		
		while(true) {
			System.out.println("MyRunnable: " +new Date());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // sleep thread for 3 sec
		}
	}
}
