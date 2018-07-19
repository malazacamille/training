package idv.camille;

public class MyMain {
	public static void main(String[] args) {
		
			
		BService bservice = 
				new BService(
						AServiceFactory.getNewInstance(IfAServiceEnum.AService))	;
		bservice.test();
		
		CService cservice = new CService();
		cservice.setAService(
				AServiceFactory.getNewInstance(IfAServiceEnum.AAService));
		cservice.exec();
	}
}
