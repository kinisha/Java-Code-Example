package Command_Line_Arguments;

import java.util.Scanner;

public class binarytoOctal {

	public static void main(String[] args) {
		int[] octal_no = new int[1000];
		int decimal=0,r,i=0;
		
		String n = args[0]; 
		int binaryNo = Integer.parseInt(n);
		int temp = binaryNo;
		/* Binary to Decimal */
		while(temp>0) {
			r = temp%10;
			decimal = decimal + (r * (int)(Math.pow(2,i)));
			temp = temp/10;
			i++;
		}
		System.out.println(binaryNo+" Binary to Decimal Number = "+decimal);
		System.out.print(decimal+" Decimal to Octal Number= ");
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
	}

}
