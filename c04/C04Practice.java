package c04;
//:C04Practice.java
class Apple {
	Apple () {
		System.out.println("This is a default " +
				"constructor of Apple");
	}
	
	Apple (String s) {
		System.out.println("You push a " +
				"string where s = " + s);
	}
}

public class C04Practice {
	public static void main(String[] args) {
		new Apple();
		System.out.println("---------------------");
		new Apple("liheng");
	}
}
