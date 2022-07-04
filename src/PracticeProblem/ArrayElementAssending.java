package PracticeProblem;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayElementAssending {

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
		System.out.println("Elements of array in asscending oder are ");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(+arr[i]);
		}
		scanner.close();


	}

}
