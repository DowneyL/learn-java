package c04;
//:InitialValues.java
// Shows default initial values

class Measurement {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	void print() {
		System.out.println(
			"Data type		Initial value\n" + 
			"boolean			" + t + "\n" +
			"char			" + c + "\n" +
			"byte			" + b + "\n" +
			"short			" + s + "\n" +
			"int			" + i + "\n" +
			"long			" + l + "\n" +
			"float			" + f + "\n" +
			"double			" + d);
	}
}

class Measurement1 {
	boolean t = true;
	char c = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 999;
	long l = 1;
	float f = 3.14f;
	double d = 3.14159;
	void print() {
		System.out.println(
			"Data type		Initial value\n" + 
			"boolean			" + t + "\n" +
			"char			" + c + "\n" +
			"byte			" + b + "\n" +
			"short			" + s + "\n" +
			"int			" + i + "\n" +
			"long			" + l + "\n" +
			"float			" + f + "\n" +
			"double			" + d);
	}
}

public class InitialValues {
	public static void main(String[] args) {
		Measurement d = new Measurement();
		d.print();
		System.out.println("----------------------------------");
		Measurement1 d1 = new Measurement1();
		d1.print();
		/* In this case you could also say:
		   new Measurement().print();
		 */
	}
}
