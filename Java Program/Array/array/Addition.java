package array;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length = s.nextInt();
		
		int arr[] = new int[length], sum=0;
		
		System.out.println("Enter the values of array");
		for(int i=0; i<length; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i=0; i<length; i++)
			sum += arr[i];
		
		System.out.println("Sum of an array: "+sum);
	}
}
