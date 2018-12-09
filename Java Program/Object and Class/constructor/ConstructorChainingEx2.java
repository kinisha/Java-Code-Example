package constructor;

class Test1{
	
	//If it’s made private, then it can only be accessed inside the class such as Constructor chaining
	private Test1(){
		System.out.println("Default constructor");
	}
	Test1(int x){
		this();
		System.out.println(x);
	}
	Test1(int x, int y){
		this(10);
		System.out.println(x+" "+y);
	}
}
public class ConstructorChainingEx2 {
	public static void main(String[] args) {
		new Test1(8,15);
		new Test1(20);
	}
}
