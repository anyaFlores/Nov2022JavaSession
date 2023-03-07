package SeleniumSessions;


//Main method and Static method - CAN BE OVERLOADING
public class MainMethodOverloading {
// JVM always check if we have a main method
	
	// JVM -- main - PVSM - string[] - always looking for this structure
	//String []a - cmd time argument(run tie arg)-CMD LINE ARGUMENT
	
	// OVERLOADING - param should be different 
	
	public static void main(String []a) { //array of parameters
		//Main method is inside Common memory allocation(CMA), does not return anything, publicly avaivible - JVM can access it
		System.out.println("hello");
		//System.out.println(a[0]);// AOB exeption, no memory is allocate, coz we didnt pass any parameters
	
		MainMethodOverloading.main(20);
	}

	
	
	public static void main(String a) { //array of parameters
		System.out.println("hello");

	}
	
	public static void main(int i) { 
		System.out.println(i);
		System.out.println("main 1 param");
	}
	public static void main(int i, int j) { 
		System.out.println(i);
		System.out.println("main 2 param");
	}

}
