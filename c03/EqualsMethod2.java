package c03;
//:EqualsMethod2.java
class Value {
	int i;
}

public class EqualsMethod2 {
	public static void main (String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println(v1 == v2);
		// equals 默认行为是比较句柄
		System.out.println(v1.equals(v2));
	}
}///:~
