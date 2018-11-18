package example;

class Factorial{
	void fact(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++)
			fact = fact*i;
		System.out.println(fact);
	}
}
public class AnonymousObject {
	public static void main(String[] args) {
		//Calling method with anonymous object
		new Factorial().fact(10);
		new Factorial().fact(5);
	}

}
