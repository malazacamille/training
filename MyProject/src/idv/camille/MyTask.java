package idv.camille;

public class MyTask {

		public void myJob() {
			try {
				// the task spends to  3 seconds
			Thread.sleep(3000);
			System.out.println("Job Finished");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			
			
			
		}
}
