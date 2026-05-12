package patterns;

import java.util.*;

public class inh180RO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		// outer loop -> rows
		for (int i = 1; i <= p; i++) {
			// inner loop ->space
			for (int j = 1; j <= p - i; j++) {
				System.out.print(" ");
			}
			// inner loop -> star print
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
