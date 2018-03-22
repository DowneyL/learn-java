package c07.innerscopes;
//:Parcel7.java
// An anonymous inner class that calls the 
// base-class constructor

public class Parcel7 {
	public Wrapping wrap(int x) {
		// Base constructor call:
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Wrapping w = p.wrap(10);
		System.out.println(w.value());
	}
}
