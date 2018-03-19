package c06;
//:BlankFinal.java
// "Blank" final data members

class Poppet { }

public class BlankFinal {
	final int i = 1; // Initialized final
	final int j;
	final Poppet p;// Blank final handle
	// Blank finals MUST be initialized
	// in the constructor:
	BlankFinal() {
		j = 1;
		p = new Poppet();
	}
	
	BlankFinal(int x) {
		j = x;
		p = new Poppet();
	}
	
	public static void main(String[] args) {
		BlankFinal bf = new BlankFinal();
		BlankFinal bf2 = new BlankFinal(666);
		System.out.println(bf.j + bf.i);
		System.out.println(bf2.j + bf.i);
	}
}///:~
