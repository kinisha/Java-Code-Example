package this_keyword;

//this: to refer current class instance variable
class Student{
	int id;
	String name;
	
	Student(int id, String name){
		//this keyword use when parameters (formal arguments) and instance variables are same.
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rajesh");
		s1.display();
	}

}
