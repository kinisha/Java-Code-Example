package Command_Line_Arguments;

import java.util.Scanner;

public class binarytoDecimal {

	public static void main(String[] args) {
		System.out.println("Enter decimal number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum=0,r,i=0;
		
		while(num>0) {
			r = num%10;
			sum = sum + (r * (int)(Math.pow(2,i)));
			num = num/10;
			i++;
		}
		System.out.println(sum);
		
		/*Command Line Argument*/
		String n = args[0]; 
		int binaryNo = Integer.parseInt(n);
		sum = 0;i=0;
		
		while(binaryNo>0) {
			r = binaryNo%10;
			sum = sum + (r * (int)(Math.pow(2,i)));
			binaryNo = binaryNo/10;
			i++;
		}
		System.out.println(sum);

	}

}
