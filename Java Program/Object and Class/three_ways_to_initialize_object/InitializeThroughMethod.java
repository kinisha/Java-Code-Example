package three_ways_to_initialize_object;

class Student1{
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}

public class InitializeThroughMethod {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.insertRecord(1, "Dimple");
		s2.insertRecord(2, "Kinisha");
		s1.displayInformation();
		s2.displayInformation();
	}

}
