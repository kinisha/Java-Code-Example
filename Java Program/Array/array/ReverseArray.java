package array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length = s.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter the values of array");
		for(int i=0; i<length; i++) {
			arr[i] = s.nextInt();
		}
		
		//printing values before reversing an array
		System.out.println("Before Reversing an array");
		for(int i=0; i<length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\n\nAfter Reversing an array");
		for(int i=length-1; i>=0; i--)
			System.out.print(arr[i]+" ");
	}
}
