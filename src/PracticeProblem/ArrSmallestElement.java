package PracticeProblem;
import java.util.Scanner;

public class ArrSmallestElement {

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
					System.out.println(arr[i]);
				}
				sc.close();
				int min = arr[0];
				for(int i=1; i<arr.length; i++) {
					if (arr[i]< min) {
						min= arr[i];
			}
		}
				System.out.println("Smallest element is " +min);
	}

}
