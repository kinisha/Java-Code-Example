package object_and_class;

//To Illustrate how to define class and fields.
//Defining a Class
public class ClassDecInMain {

	//Defining fields
	int id ;
	String name;
	
	//Creating main method inside class
	public static void main(String[] args) {
		//Creating Object or instance
		ClassDecInMain c1 = new ClassDecInMain();
		
		//Accessing value through reference variable
		System.out.println(c1.id);
		System.out.println(c1.name);
	}

}
