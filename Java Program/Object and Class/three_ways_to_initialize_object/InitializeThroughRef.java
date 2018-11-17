package three_ways_to_initialize_object;

class Student{
	int id;
	String name;
}
public class InitializeThroughRef {
	public static void main(String[] args) {
		//Creating multiple objects through ref variable
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 01;
		s1.name = "Dimple";
		s2.id = 02;
		s2.name = "Kinisha";
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}
