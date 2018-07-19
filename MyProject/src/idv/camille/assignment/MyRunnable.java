package idv.camille.assignment;



public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(MyRunnable.class.getName()+ ":" +Thread.currentThread().getName());
		
		for(int i = 0; i < 20 ; i++ ) {
			System.out.println("MyRunnable: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}
