package c04;
//:DefaultConstructor.java

class Bird {
	int i;
}

class Bush {
	Bush(int i) {
		System.out.println("int " + i);
	}
	Bush(double d) {
		System.out.println("double " + d);
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(); // default;
		new Bush((double)1);
		
	}
}///:~
