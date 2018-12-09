package constructor;

class Temp{
	{
		System.out.println("init block");
	}
	Temp(){
		System.out.println("default constructor");
	}
	Temp(int x){
		System.out.println(x);
	}
	//more than one init block
	{
		System.out.println("second init block");
	}
}
public class InitBlockEx {
	public static void main(String[] args) {
		new Temp();
		new Temp(100);
	}
}
