package c05.dessert;
//:Cookie.java
// Creates a library

public class Cookie {
	public Cookie() {
		System.out.println("Cookie constructor");
	}
	
	protected void foo() { System.out.println("foo"); }
	
	public static void main(String[] args) {
		Cookie x = new Cookie();
		x.foo();
	}
}///:~
