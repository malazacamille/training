package idv.camille;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	
	
	
}
