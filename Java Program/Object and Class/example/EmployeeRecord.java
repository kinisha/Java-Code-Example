package example;

class Employee{
	int id;
	String name;
	float salary;
	
	void insertRecord(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class EmployeeRecord {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.insertRecord(1, "Dimple", 25000);
		e2.insertRecord(2, "Kinisha", 15000);
		e3.insertRecord(3, "Sneha", 26000);
		e1.display();
		e2.display();
		e3.display();
	}

}
