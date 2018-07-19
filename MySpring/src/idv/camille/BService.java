package idv.camille;

public class BService {
	
	private static IfAService aservice;

/*	static {
		aservice =AServiceFactory.getInstance();
	}*/
	
	//Constructor injection
	public BService(IfAService aservice) {
		this.aservice = aservice;
	}
	
	public void test() {
		aservice.execute();
	}
}
