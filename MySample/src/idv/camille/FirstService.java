package idv.camille;

public class FirstService {
	
	private static IfTransportation firstService;
	
	public FirstService() {
		
	}
	
	//interface injection
		static {
			firstService =TransportationFactory.getInstance();
		}
		
	public void test() {
		firstService.travel();
	}
}
