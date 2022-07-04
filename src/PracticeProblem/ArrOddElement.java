package PracticeProblem;

import java.util.Scanner;

public class ArrOddElement {

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
		System.out.println("Elements present on odd position is  " );
		for (int i=1; i<arr.length; i=i+2) {
			
			
			System.out.println(+arr[i]);

		}

         }
     }
