package c04;
//:ArrayInit.java
// Array initialization

public class ArrayInit {
	public static void main(String[] args) {
		Integer[] a = {
				new Integer(1),
				new Integer(2),
				new Integer(3),
		};
		
		// Java 1.1 only:
		Integer[] b = new Integer[] {
				new Integer(1),
				new Integer(2),
				new Integer(3),
				new Integer(3),
		};

		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.println("-----------------------------");
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
