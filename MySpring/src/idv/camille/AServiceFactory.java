package idv.camille;

public class AServiceFactory {
	
	private static IfAService aservice = null;
	private static  IfAService aaservice = null;
	
	
	private AServiceFactory() {
		
	}
	
	
	//singleton pattern
	public static IfAService getInstance(IfAServiceEnum enu) {
		//double-checked locking
		if(aservice == null) {
			synchronized(AServiceFactory.class) {
				if(aservice == null) {
					aservice = new AService();
				}
			}
		}
		
		if(aaservice == null) {
			synchronized(AServiceFactory.class) {
				if(aaservice == null) {
					aaservice = new AService();
				}
			}
		}
		
		if(enu.equals(IfAServiceEnum.AService)) {
			return aservice;
		}
		
		if(enu.equals(IfAServiceEnum.AAService)) {
			return aaservice;
		}
		return null;
	}
	
	//prototype pattern
	
	public static IfAService getNewInstance(IfAServiceEnum enu) {
		if(enu.equals(IfAServiceEnum.AService)) {
			return new AService();
		}
		
		if(enu.equals(IfAServiceEnum.AAService)) {
			return  new AAService();
		}
		return null;
	}
	
	//strategy pattern
	
	
}
