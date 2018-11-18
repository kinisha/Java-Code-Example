package constructor;

class Student2{
	int id; 
	String name;
	
	Student2(int i, String n){
		id = i;
		name = n;
	}
	
	Student2(){}
	
	void display() {
		System.out.println(id+" "+name);
	}
}
public class CopyWithoutConstructor {
	public static void main(String[] args) {
		Student2 s1 = new Student2(1,"Kinisha");
		Student2 s2 = new Student2();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}

}
