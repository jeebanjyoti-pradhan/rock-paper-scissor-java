package JavaYT;

public class practiceMethods {
	// problem 1
	static void mul(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.format("%d x %d = %d \n", n, i, n * i);
		}

	}

	// problem 2
	static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	// problem 3
	static int sumRec(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumRec(n - 1);
	}

	// problem 4
	static void pattern1(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	// problem 5
	static int fib(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	// problem 6
	// static double avg(double... number){

	// for (double a : number) {
	// double result = 0;
	// result += a;
	// return result/number.length;
	// }

	// }

	// problem 7
	static void pattern_rec(int n) {
		if (n > 0) {
			pattern_rec(n - 1);
			for (int i = 1; i <= n; i++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	// problem 8
	static void pattern1_rec(int n) {
		if (n < 0) {
			pattern1_rec(n + 1);
			for (int i = n; i >= 1; i++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// 1.Write a Java method to print the multiplication table of a number n.
		mul(20);

		// 2.Write a program using functions to print the following pattern

		pattern(5);
		// 3.Write a recursive function to calculate the sum of the first n natural
		// numbers.
		int c = sumRec(4);
		System.out.println(c);

		// 4.
		pattern1(5);

		// 5.
		int series = fib(7);
		System.out.println(series);

		// 6.
		// System.out.println(avg(56, 47, 56, 24, 78));

		// 7.
		pattern_rec(10);

		// 8.
		pattern1_rec(10);

	}

}
