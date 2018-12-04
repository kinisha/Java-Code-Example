package regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx6 {
	public static void main(String[] args) {
		System.out.println("Enter regext pattern: ");
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile(sc.nextLine());
		System.out.println("Enter the text: ");
		Matcher m = p.matcher(sc.nextLine());
		boolean found = false;
		while(m.find()) {
			System.out.println("I found the text "+m.group()+" starting at index "+m.start()+" and ending at index "+m.end());
			found = true;
		}
		if(!found) {
			System.out.println("Match not found");
		}
	}
}
