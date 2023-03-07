package MethodCalling;

public class User {
	//usecase for this keyword
	//1. const
	//2. methods - encapsulation -- setter/getter
	//3. builder pattern
	//4. const is calling another const
	//5. can be used in method to call another method in the same class
	
	private String name;
	int age;
	String city;
	
	static double salary;
	
	//for static - NO NEED to create an OBJ
	
	public User(String name, int age, String city) {
		this(city); //must be on the 1st place- call 2nd constractor in the 1 st constractor
		//can not call 2 constractors
		this.name = name;
		this.age = age;
		//this.city = city;// if we comment- will give Paris city
	}

	public User(String name, int age) {
		this(name, age, "Pune");

		this.name = name;
		this.age = age;
	}
	
	public User(String city) {

this.city = "Paris";
	}

	public void login() {
		this.login();//logout method of the class
		this.name = "Tom";//variable(only global variable, not the local) of the class
		// or we can write name = "Tom"
		User.salary = 12.33;
		
	}
	
	public void logout() {
	
	}

	public static void main(String[] args) {
		User u1 = new User("Gaurav", 30, "Kiev");
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);


	}

}
