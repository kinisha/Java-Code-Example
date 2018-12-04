package regex_example;

import java.util.regex.Pattern;

/*Create a regular expression that accepts 10 digit numeric characters 
starting with 7, 8 or 9 only.*/  
 
public class RegexEx5 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7891078450"));//true 
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "5891078450"));//false starts from 5 instead of 7,8 or 9
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7891078450125"));//false 13digit number
		
		System.out.println("\nby metacharacters..");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "7891078450"));//true
	}
}
