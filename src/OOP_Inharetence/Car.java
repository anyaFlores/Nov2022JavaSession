package OOP_Inharetence;

public class Car extends Vehicle{ 
	//final
	//constant values
	//final keyword = cant be overwritten & method Hiding
	//final Class - caan't be a parent.-inheritance 
	


	//displayLogo method is final(noone can override it)
	public void start() {
		System.out.println("Car -- start");
	}
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	 public static void billing() {
		 System.out.println("Car----billing");
	 }

	 public static final  void display() {//will go to common memory allocation
		 System.out.println("Car----display");
	 }
	 
	 public  final  void running() {
		 System.out.println("Car----running");
	 }
	 
	 public  void payment(String cc, int cvv) {
		 System.out.println("Car payment using : "+ cc + " " + cvv);
	 }
	 
	 public  void payment(String upi) {
		 System.out.println("Car payment using : "+ upi);
	 }
	 
	 @Override
	 public void engine() {
			System.out.println("CAR -- engine");
		}
}
