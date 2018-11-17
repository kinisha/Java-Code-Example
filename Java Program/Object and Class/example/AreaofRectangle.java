package example;

class Rectangle{
	int length;
	int breadth;
	
	void insertData(int l, int b) {
		length = l;
		breadth = b;
	}
	
	void calculateData() {
		System.out.println(length*breadth);
	}
}
public class AreaofRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insertData(10, 15);
		r2.insertData(15, 15);
		r1.calculateData();
		r2.calculateData();
	}

}
