/*package idv.camille;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
	
	private static String name = "Camille";
	
	public static void main (String [] args) {
		
		ScheduledExecutorService scheduler =
			     Executors.newScheduledThreadPool(1);
     
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 16);
		today.set(Calendar.MINUTE, 39);
		today.set(Calendar.SECOND, 0);

		Timer timer = new Timer()	;
		timer.schedule(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		}, today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
		
		
		
	
	}
	
	
}
*/