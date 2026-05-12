package JavaYT;

public class methods {

	static void jeeban() {
		System.out.println("Arguments are actual");
	}

	static void jeeban(int a) {
		System.out.println("MO cannot be refer by changing the return type " + a + " of the method");
	}

	static void jeeban(int a, int c, int b) {
		System.out.println("jeeban " + a + " " + c + " " + b + " jyoti");

	}

	static void change(int[] arr) {
		arr[2] = 817;
	}

	static int jeeban(int x, int y) {
		int z;
		if (x > y) {
			z = x * y / 5;
		} else {
			z = x + y;
		}

		return z;
	}

	public static void main(String[] args) {
		// int a = 12;
		// int b = 5;
		// int c;
		// c = jeeban(a, b);

		// int a1 = 6;
		// int b1 = 3;
		// int c1;
		// c1 = jeeban(a1, b1);

		int[] mark = { 23, 56, 43, 76 };
		change(mark);
		System.out.println(mark[2]);

		// method overloading
		jeeban();
		jeeban(23);
		jeeban(678, 987, 4657);
	}

}
