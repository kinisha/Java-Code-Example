package Command_Line_Arguments;

import java.util.Scanner;

public class binarytoOctal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Binary Number");
		int num = s.nextInt();
		
		int[] octal_no = new int[1000];
		int decimal=0,r,i=0;
		
		/* Binary to Decimal */
		while(num>0) {
			r = num%10;
			decimal = decimal + (r * (int)(Math.pow(2,i)));
			num = num/10;
			i++;
		}
		
		/* Decimal to Octal */
		i=1;
		while(decimal>0) {
			octal_no[i] = decimal%8;
			decimal = decimal/8;
			i++;
		}
		for(int j=i-1; j>0; j--) {
			System.out.print(octal_no[j]);
		}
		
		/*Command Line Argument*/
		/*String n = args[0]; 
		int binaryNo = Integer.parseInt(n);
		sum = 0;i=0;
		
		while(binaryNo>0) {
			r = binaryNo%10;
			sum = sum + (r * (int)(Math.pow(2,i)));
			binaryNo = binaryNo/10;
			i++;
		}
		System.out.println(sum);*/
	}

}
