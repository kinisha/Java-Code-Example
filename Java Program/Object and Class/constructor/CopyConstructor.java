package constructor;
//to copy the values of one object into another using java constructor.
class Student1{
	int id;
	String name;
	
	//constructor to initialize integer and string  
	Student1(int i, String n){
		id = i;
		name = n;
	}
	
	//constructor to initialize another object  
	Student1(Student1 s){
		id = s.id;
		name = s.name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
}
public class CopyConstructor {
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "Kinisha");
		Student1 s2 = new Student1(s1);
		s1.display();
		s2.display();
	}

}
