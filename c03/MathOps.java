package c03;

//:MathOps.java
// learn mathops

import java.util.*;

public class MathOps {
	// Create a shorthand to save typing;
	static void prt (String s) {
		System.out.println(s);
	}
	
	// Shorthand to print a string and an int:
	static void pInt (String s, int i) {
		prt(s + " = " + i);
	}
	
	//Shorthand to print a string and a float:
	static void pFlt (String s, float f) {
		prt(s + " = " + f);
	}
	
	public static void main (String[] args) {
		// Create a random number generator:
		// Sends with current time by default:
		Random rand = new Random();
		int i,j,k;
		// "%" limits maximum value to 99
		j = rand.nextInt() % 100;
		k = rand.nextInt() % 100;
		pInt("j", j);
		pInt("k", k);
		i = j + k; pInt("j + k", i);
		i = j - k; pInt("j - k", i);
		i = j * k; pInt("j * k", i);
		i = j / k; pInt("j / k", i);
		i = j % k; pInt("j % k", i);
		j %= k; pInt("j %= k", j);
		prt("--------------");
		// Floating point number tests:
		float u,v,w; // applies to double too
		v = rand.nextFloat();
		w = rand.nextFloat();
		pFlt("v", v);
		pFlt("w", w);
		u = v + w; pFlt("v + w", u);
		u = v - w; pFlt("v - w", u);
		u = v * w; pFlt("v * w", u);
		u = v / w; pFlt("v / w", u);
		u = v % w; pFlt("v % w", u);
		prt("--------------");
		// The following also works for
		// char, byte, short, int, long,
		// and double:
		u += v; pFlt("u += v", u);
		u -= v; pFlt("u -= v", u);
		u *= v; pFlt("u *= v", u);
		u /= v; pFlt("u /= v", u);
	}
}///:~