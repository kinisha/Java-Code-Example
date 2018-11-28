package multidimensional_array;

import java.util.Scanner;

public class MultiplicationOfMatrices {
	public static void main(String[] args) {
		int row, column;
		
		//Input from User for no of rows and columns
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of rows");
		row = s.nextInt();
		System.out.println("Enter no of columns");
		column = s.nextInt();
		
		//Initialization of Arrays
		int arr_first[][] = new int[row][column];
		int arr_second[][] = new int[row][column];
		int add[][] = new int[row][column];
		
		//Values for Matrices
		System.out.println("Enter values for first matrix");
		for(int i=0; i<row; i++)
			for(int j=0; j<column; j++)
				arr_first[i][j] = s.nextInt();
		
		System.out.println("Enter values for second matrix");
		for(int i=0; i<row; i++)
			for(int j=0; j<column; j++)
				arr_second[i][j] = s.nextInt();
		
		//Multiplication of two Matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				add[i][j] = 0;
				for(int k=0; k<row; k++) {
					add[i][j] += arr_first[i][k] * arr_second[k][i];
				}
			}
		}
		//Printing Values of Multiplication of two Matrices
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
}
