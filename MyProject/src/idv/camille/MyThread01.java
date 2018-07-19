package idv.camille;

import java.util.Date;

public class MyThread01 extends Thread {
	
	public void run() {
		System.out.println(MyThread01.class.getName()+ ":" +Thread.currentThread().getName());
		
		
		while(true) {
			System.out.println("MyThread01: " +new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // sleep thread for 1 sec
		}
	}

}
