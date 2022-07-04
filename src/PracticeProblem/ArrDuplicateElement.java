package PracticeProblem;
import java.util.Scanner;

public class ArrDuplicateElement {

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
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("The Duplicate elements is " +arr[j]);
				}
			}
		}

	}

}
