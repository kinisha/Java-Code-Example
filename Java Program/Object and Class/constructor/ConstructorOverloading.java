package constructor;

class Area{
	int length;
	int breadth;
	float radius;
	
	Area(float r){
		radius = r;
		System.out.println(radius*radius*3.14);
	}
	Area(int l, int b){
		length = l;
		breadth = b;
		System.out.println(length*breadth);
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		new Area(5);
		Area b = new Area(5,4);
	}
}
