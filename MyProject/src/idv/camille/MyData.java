package idv.camille;

import java.util.concurrent.atomic.AtomicInteger;

public class MyData {

//	private static int count = 0; // use static to have different instance but  have one space in the memory

	private static AtomicInteger count = new AtomicInteger(0); // other way to synchronized 
	public static int getCount() {
		return MyData.count.get();
	}

	/*public  synchronized static void count() { // 1st way to synchronized 
		MyData.count++;
	}*/
	
	/*public void count() {
		synchronized(MyData.class) { // 2nd way to synchronized 
			MyData.count++;
		}
	}*/
	
	public void count() {
		count.getAndIncrement();
	}
	
	
}
