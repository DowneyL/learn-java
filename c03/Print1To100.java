package c03;
//:Print1To100.java
// print 1 to 100 of integral

public class Print1To100 {
	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if (i == 47) {
				return;
			}
			System.out.println(i);
		}
	}
}
