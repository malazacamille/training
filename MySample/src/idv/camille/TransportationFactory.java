package idv.camille;

public class TransportationFactory {

	 private static IfTransportation jeep = null;
	 private static IfTransportation train = null;
	 private static IfTransportation van = null;
	 
	 private TransportationFactory(){
		 
	 }
	 
	
	//singleton pattern
		public static IfTransportation getInstance() {
			//double-checked locking
			if(jeep == null) {
				synchronized(TransportationFactory.class) {
					if(jeep == null) {
						jeep = new Jeep();
					}
				}
			}
			
			if(train == null) {
				synchronized(TransportationFactory.class) {
					if(train == null) {
						train = new Train();
					}
				}
			}
			
			if(van == null) {
				synchronized(TransportationFactory.class) {
					if(van == null) {
						van = new Van();
					}
				}
			}
			return null;
		}
	
		//prototype pattern
		
		public static IfTransportation getNewInstance(IfTransportationEnum enu) {
			if(enu.equals(IfTransportationEnum.Jeep)) {
				return new Jeep();
			}
			
			if(enu.equals(IfTransportationEnum.Train)) {
				return  new Train();
			}
			
			if(enu.equals(IfTransportationEnum.Van)) {
				return  new Van();
			}
			
			return null;
		}
}
