package c04;
//:Flower.java
// Calling constructors with "this"

public class Flower {
	private int petalCount = 0;
	private String s = new String("null");
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = " + petalCount);
	}
	
	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s = " + ss);
	}
	
	Flower(String s, int petals) {
		this(petals);
		// !this(s) Can't call two!
		this.s = s;
		System.out.println("String & int argas");
	}
	
	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void print() {
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		Flower x = new Flower();
		x.print();
	}
}
