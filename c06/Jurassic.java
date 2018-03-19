package c06;
//:Jurassic.java
// Making an entire class final

class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {
		System.out.println(i);
		System.out.println(j);
	}
}

// class Further extends Dinosaur {}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
		d.i = 40;
		d.j++;
		d.f();
	}
}///:~
