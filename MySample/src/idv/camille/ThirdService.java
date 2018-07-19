package idv.camille;

public class ThirdService {
	
	private static IfTransportation thirdService;


	//Constructor injection
	public ThirdService (IfTransportation thirdService) {
		this.thirdService = thirdService;
	}
	
	public void test() {
		thirdService.travel();
	}
}
