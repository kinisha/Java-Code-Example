package constructor;

class Base{
	String name;
	
	Base(){
		this("");
		System.out.println("No-argument of constructor of base class");
	}

	Base(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor of base");
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("No-argument of constructor of derived class");
	}
	Derived(String name){
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}
}
public class ConstructorChainingEx3 {
	public static void main(String[] args) {
		new Derived("Kinisha");
	}

}
