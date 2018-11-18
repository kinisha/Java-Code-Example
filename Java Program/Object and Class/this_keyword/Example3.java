package this_keyword;

class Student1{
	int rollno;
	String name,course;
	float fee;
	
	Student1(int rollno, String name, String course){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	Student1(int rollno, String name, String course,float fee){
		//Call to this() must be the first statement in constructor.
		this(rollno, name, course); //reusing constructor
		this.fee = fee;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
public class Example3 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Kinisha", "Java");
		Student1 s2 = new Student1(2, "Dimple", "Python", 40000);
		s1.display();
		s2.display();
	}

}
