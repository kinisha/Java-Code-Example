package static_example;

class Student1{
	int rollno;
	String name;
	static String college = "ITS"; //static variable
	
	static void change() {
		college = "IIT";
	}
	Student1(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Student1.change();
		Student1 s1 = new Student1(1,"Dimple"), s2 = new Student1(2, "Kinisha");
		s1.display();
		s2.display();
	}

}
