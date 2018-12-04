package regex_example;

import java.util.regex.*;

public class RegexEx1 {
	public static void main(String[] args) {
		//The . (dot) represents a single character.
		//1st way
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b1 = m.matches();
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		boolean b3 = Pattern.matches(".s", "as");
		
		System.out.print(b1 +" "+b2+" "+b3); //true true true
	}
}
