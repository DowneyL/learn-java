package c04;
//:ArrayNew.java
// Creating arrays with new.
import java.util.*;

public class ArrayNew {
	static Random rand = new Random();
	static int pRand(int mod) {
		return Math.abs(rand.nextInt()) % mod + 1;
	}
	public static void main(String[] args) {
		int[] a;
		a = new int[pRand(5)];
		prt("length of a = " + a.length);
		for (int i = 0; i < a.length; i++)
			prt("a[" + i + "] = " + a[i]);

		prt("--------------------");
		
		char[] a1;
		a1 = new char[11];
		prt("length of a1 = " + a1.length);
		for (int i = 0; i < a1.length; i++)
			prt("a1[" + i + "] = " + a1[i]);
	}
	static void prt(String s) {
		System.out.println(s);
	}
}///:~
