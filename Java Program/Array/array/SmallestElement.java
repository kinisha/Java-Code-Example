package array;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length = s.nextInt();
		
		int arr[] = new int[length], min;
		
		System.out.println("Enter the values of array");
		for(int i=0; i<length; i++) {
			arr[i] = s.nextInt();
		}
		
		min = arr[0];
		for(int i=1; i<length; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.println("Smallest number in an array is "+min);
	}
}
