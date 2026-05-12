package patterns;

public class halfPyramidwithNUM {
	public static void main(String[] args) {
		int n = 6;
		// outer loop
		for (int i = 1; i <= 6; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
