package idv.camille;

public class CService {
	
	private IfAService aservice;

	//interface injection
/*	static {
		aservice =AServiceFactory.getInstance();
	}*/
	
	//setter injections
	public void setAService(IfAService aservice) {
		this.aservice = aservice;
	}
	
	public void exec() {
		
		aservice.execute();

	}
}
