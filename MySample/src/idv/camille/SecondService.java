package idv.camille;

public class SecondService {
	
private IfTransportation secondService;
	
//setter injections
	public void setAService(IfTransportation secondService) {
		this.secondService = secondService;
	}
	
	public void exec() {
		secondService.travel();
	}
}
