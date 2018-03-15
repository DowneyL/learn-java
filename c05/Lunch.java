package c05;
//:Lunch.java
// Demonstrates class access specifiers.
// Make a class effectively private
// with private constructors:

class Soup {
	private Soup() { System.out.println("new Soup"); }
	
	// 1. Allow creation via static method:
	public static Soup makeSoup() {
		return new Soup();
	}
	
	// 2.Create a static object and
	// return a reference upon request.
	// (The "Singleton" pattern):
	
	private static Soup ps1 = new Soup();
	
	public static Soup access() {
		return ps1;
	}
	
	public void f() { System.out.println("f()"); }
}

class Sandwich { // Use Lunch
	void f() { new Lunch(); }
}

public class Lunch {
	void test() {
		// Can't do this! Private constructor:
		//! Soup priv1 = new Soup();
		Soup priv2 = Soup.makeSoup();
		Sandwich f1 = new Sandwich();
		Soup.access().f();
	}
	
	public static void main(String[] args) {
		Lunch x = new Lunch();
		x.test();
	}
}
