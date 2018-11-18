package overriding;

class Bank{
	int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}
}
class ICICI extends Bank{
	int getRateOfInterest() {return 9;}
}
	
public class Example1 {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
	}

}
