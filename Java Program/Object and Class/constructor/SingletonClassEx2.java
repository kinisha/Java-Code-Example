package constructor;

class Singleton1{
	// static variable single_instance of type Singleton 
	private static Singleton1 single_instance = null; 
	
	// variable of type String 
	String s;
	
	// private constructor restricted to this class itself 
	private Singleton1(){
		s = "Hello I am a string part of singleton class";
	}
	
	// static method to create instance of Singleton class 
	public static Singleton1 Singleton1() {
		if(single_instance == null)
			single_instance = new Singleton1();
		
		return single_instance;
	}
}

public class SingletonClassEx2 {

	public static void main(String[] args) {
		// instantiating Singleton class with variable x 
		Singleton1 x = Singleton1.Singleton1();
		
		// instantiating Singleton class with variable y
		Singleton1 y = Singleton1.Singleton1();
		
		// instantiating Singleton class with variable z
		Singleton1 z = Singleton1.Singleton1();
		
		// changing variable of instance x 
		x.s = x.s.toUpperCase();
		System.out.println("String from x is "+x.s);
		System.out.println("String from x is "+y.s);
		System.out.println("String from x is "+z.s);
		
		// changing variable of instance y
		y.s = y.s.toLowerCase();
		System.out.println("String from x is "+x.s);
		System.out.println("String from x is "+y.s);
		System.out.println("String from x is "+z.s);
	}

}
