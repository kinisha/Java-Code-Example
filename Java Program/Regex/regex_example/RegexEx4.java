package regex_example;

import java.util.regex.Pattern;

/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/  

public class RegexEx4 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Dimple")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Kinisha")); //false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Dimple@2018")); //false ($is not matched)
	}
}
