import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take input from user");
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		System.out.println("Enter number 3");
		int c = sc.nextInt();
		int sum = a + b + c;
		System.out.println("The sum of three integers are:");
		System.out.println(sum);
	}
}

