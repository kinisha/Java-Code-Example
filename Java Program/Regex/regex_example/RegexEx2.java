package regex_example;

import java.util.regex.*;

public class RegexEx2 {
	public static void main(String[] args) {
		// The . (dot) represents a single character.
		System.out.println(Pattern.matches(".s", "as")); //true 2nd char is s
		System.out.println(Pattern.matches(".s", "me")); //false 2nd char is not s
		System.out.println(Pattern.matches(".s", "mst")); //false has more than 2 char
		System.out.println(Pattern.matches(".s.", "mst")); //true has 3 char and 2nd char is s
		System.out.println(Pattern.matches(".s", "mates")); //false has more than 2 char
		System.out.println(Pattern.matches("..s", "mas")); //true 3rd char is s
		
		System.out.println();
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammna"));
		
		System.out.println();
		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		
		System.out.println();
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		  
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
		System.out.println(Pattern.matches("[amn]*", "ammm")); //true
	}
}
