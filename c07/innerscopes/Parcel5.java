package c07.innerscopes;
//:Parcel5.java
// Nesting class within a scope

public class Parcel5 {
	private String internalTracking(boolean b) {
		String s = "";
		if(b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() { return id; }
			}
			
			TrackingSlip ts = new TrackingSlip("get");
			s = ts.getSlip();
		}
		
		return s;
		// Can't use it here! Out of scope:
//		TrackingSlip ts = new TrackingSlip("x");
	}
	
	public String track() { return internalTracking(true); }

	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		System.out.println(p.track());
	}
}///:~
