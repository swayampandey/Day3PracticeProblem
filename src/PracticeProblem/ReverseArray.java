package PracticeProblem;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		System.out.println("Enter array elements");

		for (int i=0; i<arrSize; i++) {
			arr[i] =sc.nextInt();
		}
		for(int i=0; i<arrSize; i++) {
			
		}
		sc.close();
		System.out.println("Array in reverse order is ");
		for(int j=arr.length-1; j>=0;j--) {
			System.out.println(arr[j]);
		}

	}

}
