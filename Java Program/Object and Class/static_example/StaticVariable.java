package static_example;

class Student{
	int rollno;
	String name;
	static String college = "ITS"; //static variable
	
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class StaticVariable {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Dimple"), s2 = new Student(2, "Kinisha");
		s1.display();
		s2.display();
	}

}
