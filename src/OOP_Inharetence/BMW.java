package OOP_Inharetence;

public class BMW extends Car {
	//
	//start method- method OVERRIDING--between parent and child class
	//PolyMorphism: Overloading and Overriding
	
	//1.with the SAME  method name
	//usecase: i don't want to use old start method(new feature of BMW)
	//2.SAME # of parameters
	//3.SAME sequence of parameters 
	//4.return type -->must be SAME return type
	
	@Override //good practice to write annotation -if doesnt give an error-->it is good
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void autoParking() {
		System.out.println("Car -- autoParking");
	}
	
	//overriding not possible for static method
	//Method Hiding
	public static void billing() {
		 System.out.println("Car----billing");
	 }
	//final method cant be overwritten
//	 public static final  void display() {//will go to common memory allocation
//		 System.out.println("Car----display");
//	 }
//	 
//	 public  final  void running() {
//		 System.out.println("Car----running");
//	 }
	
	@Override
	 public  void payment(String cc, int cvv) {
		 System.out.println("BMW payment using : "+ cc + " " + cvv);
	 }
	 
	@Override
	 public  void payment(String upi) {
		 System.out.println("BMW payment using : "+ upi);
	
	}
//	@Override
//	public void engine() {
//		System.out.println("BMW -- engine");
//	}
	
}
