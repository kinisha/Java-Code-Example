package constructor;

class Student{
	int id;
	String name;
	
	//Constructor
	Student(int i, String n){
		id = i;
		name = n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Dimple"), s2 = new Student(2, "Kinisha");
		s1.display();
		s2.display();
	}

}
