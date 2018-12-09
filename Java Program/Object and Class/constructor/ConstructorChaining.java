package constructor;

class Test{
	Test(){
		this(10);
		System.out.println("Default Constructor");
	}

	Test(int i) {
		this(5,8);
		System.out.println(i);
	}

	public Test(int i, int j) {
		System.out.println(i*j);
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		new Test();
	}
}
