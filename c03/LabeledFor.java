package c03;
//:LabeledFor.java
// Java's "Labeled for loop"

public class LabeledFor {
	static void prt(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		int i = 0;
		outer: // Can't have statements here
			for(; true ;) { //infinite loop
				inner: //Can't have statements here
					for(; i < 10; i++) {
						prt("i = " + i);
						if(i == 2) {
							prt("continue");
							continue;
						}
						if (i == 3) {
							prt("break");
							i++;
							break;
						}
						if(i == 7) {
							prt("continue outer");
							i++;
							continue outer;
						}
						if(i == 8) {
							prt("break outer");
							break outer;
						}
						for(int k = 0; k < 5; k++) {
//							prt("k = " + k);
							if(k == 3) {
								prt("continue inner");
								continue inner;
							}
						}
					}
			}
		//Can't break for continue
		//to labels here
	}
}///:~
