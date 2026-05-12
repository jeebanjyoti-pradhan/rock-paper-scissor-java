package JavaYT;

//import java.util.*;

public class practiceArray {
	public static void main(String[] args) {
		// 1.create an array of 5 floats and find the sum
		// float []num=new float[5];
		// num[0]=12.5f;
		// num[1]=10.3f;
		// num[2]=89.9f;
		// num[3]=62.5f;
		// num[4]=90.4f;
		// // float sum=num[0]+num[1]+num[2]+num[3]+num[4];
		// // System.out.println(sum);

		// float sum=0;
		// for(float i=0;i<num.length;i++){
		// sum=sum+num[i];
		// }
		// System.out.println(sum);

		// 2.Program to find out whether a given integer is present in the array or not.
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] find = { 23, 67, 90, 100, 56 };
		// boolean found = false;
		// for (int element : find) {
		// if (n == element) {
		// found = true;
		// break;
		// }
		// }
		// if (found) {
		// System.out.println("present in the array");
		// } else {
		// System.out.println("not present in the array");
		// }

		// 3.calculate avg marks from an array cantains marks of all students in physics
		// using for-each loop

		// int []marks={76,43,98,81,33};
		// int sum=0;
		// for(int i=0;i<marks.length;i++){
		// sum=sum+marks[i];
		// // int avg=sum/5;
		// }
		// System.out.println( "sum of the mark is "+ sum);
		// int avg=sum/5;
		// System.out.println("Average mark is "+ avg);

		// 4. Create a java program to add two matrices of size 2*3

		// 5.Write a program to reverse the array

		// String[] name = { "jeeban", "jyoti", "pradhan", "priya", "modi" };
		// for (int i = name.length - 1; i >= 0; i--) {
		// System.out.println(name[i]);
		// }

		// 6.Write a java program to find the maximum element in an array.

		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int[] num = { 34, 77, 10, 5, 54, 90, 191 };
		// boolean condition = false;
		// for (int element : num) {
		// 	if (n == num[6]) {
		// 		condition = true;
		// 		break;
		// 	}
		// }
		// if (condition) {
		// 	System.out.println("it is the maximum");
		// } else {
		// 	System.out.println("it is minimum");
		// }

		//7. Write java program to find the minimum element in the  array.

		int[] num = { 5,34, 77, 10, 54, 90, 191 };
		int min=0;
		for (int element : num) {
			if(element<min) {
				min=element;
			}
		}
		System.out.println("the minimum element is "+ min);
		//8. Write a program to find whether an array is sorted or not.

	}

}
