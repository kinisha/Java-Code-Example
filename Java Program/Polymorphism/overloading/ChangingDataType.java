package overloading;

class Adder1{
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
}
public class ChangingDataType {
	public static void main(String[] args) {
		System.out.println(Adder1.add(5, 10));
		System.out.println(Adder1.add(5.5, 10.0));
	}

}
