package idv.camille;

import java.util.concurrent.LinkedBlockingQueue;

public class MyConsumer extends Thread{

	private LinkedBlockingQueue<String> queue;

	public MyConsumer(LinkedBlockingQueue<String> queue) {
		
		this.queue = queue;
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
