package SeleniumSessions;

public class Car {
	String name;
	int price;
	String color;
	static final int wheels= 4;// COMMON PROPERTY values- it should define as static
	//final - no one can change it
	
	public void start() {
		System.out.println("Car -- start");
	}
	public static void speedTest() {
		System.out.println("Car -- speed test");
	}
	
	public static void main(String[] args) {

		// Static never used for Local variables, only for class 
		// Static always is 1 copy
		
		
		final int i = 10;// Using final - prevent the BUG, coz anyone can change it
//		i = 20;
//		i = 30;
		System.out.println(i);
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";
		
		Car c2 = new Car();
		c2.name = "TOYOTA";
		c2.price = 80;
		c2.color = "White";
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.price = 91;
		c3.color = "Black";
		
		//how to access/assign static variables:
		//1. DIRECT calling
		// 2. NO need of creating an OBJ-
		
	System.out.println(wheels);
	System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + wheels);
	// how to call static methods:
	// no need to use the obj
	//1. direct calling:
	speedTest();
	c1.start();
	
	//2. b using class name:
	Car.speedTest();
	
	//static stuff can be accessed 
	
	}

}
