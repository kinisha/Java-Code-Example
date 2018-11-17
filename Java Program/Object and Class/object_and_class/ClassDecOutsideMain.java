package object_and_class;

//To demonstrate having the main method in another class  
//Creating Student class.  
class Student{
	int id;
	String name;
}

//Creating another class which contains main method
public class ClassDecOutsideMain {
	public static void main(String[] args) {
		//Creating Object or instance
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}