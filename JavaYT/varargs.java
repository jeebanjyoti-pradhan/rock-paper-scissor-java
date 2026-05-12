package JavaYT;

public class varargs {
	static int foo( int... arr) {

		int result = x;
		for (int a : arr) {
			result += a;

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(foo());
		System.out.println("the sum of 4 and 5 are " + foo(4, 5));
		System.out.println(foo(5,89,47,12,58,47,3,5,568,458,1486,246,162,9852,3656));
	}

}
