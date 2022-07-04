package PracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ArrSecondHighestElement {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();
		int arr[] = new int[arrsize];
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr.length; i++) {
			int a = scanner.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);	
		System.out.println("Second Largest element is "+arr[arr.length-2]);
		scanner.close();
		

	}

}
