import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {
	public static void main (String[] args) {
		ScheduledExecutorService scheduler =
			     Executors.newScheduledThreadPool(1);
		
		
		/*
		scheduler.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println(new Date());
			}
			
		},1,1,TimeUnit.SECONDS);*/
		
		scheduler.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println(new Date());
			}
			
		},1,1,TimeUnit.SECONDS);
		
		//Change here for the hour you want ----------------------------------.at()       
		Long midnight=LocalDateTime.now().until(LocalDate.now().plusDays(1).atStartOfDay(), ChronoUnit.MINUTES);
		scheduler.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println(new Date());
			}
			
		}, midnight, 1440, TimeUnit.MINUTES);
		
	}
}