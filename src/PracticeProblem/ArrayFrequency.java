package PracticeProblem;
import java.util.Scanner;

public class ArrayFrequency {

	public static void main(String[] args) {
		
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		int arrsize = scanner.nextInt();
		int arr[] = new int[arrsize];
		int[] frequency = new int[arr.length];
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
		scanner.close();
		System.out.println(" Element | Frequency");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited)
				System.out.println("    " + arr[i] + "         " + frequency[i]);

	}

            }
 }
