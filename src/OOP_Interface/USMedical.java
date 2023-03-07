package OOP_Interface;

public interface USMedical extends WHO, USHG{
	
	int min_fee = 10;//static final int min_fee = 10 - by default
	//var: static and final by default
	
	
	//in Interface:
	// can Not have the method body
	// only method declaration - no buss logic
	// only method prototype
	
	//can Not create obj of interface
	// can Not have const.. of the interface
	
	//abstract methods:
	//final-NA
	//static- (can not be overwritten)-NA
	//private- hiding private method outside of the class-NA, how to access??to implement??
	//JDK 1.7: 100% abstraction
	//JDK 1.8: default non static methods"~100%
	
	public void cardioServices();
	public void neuroServices();
	public void phsycoServices();
	
	public void emergencyServices();
	
	public void covidVaccination();
	
	
	//After JDK 1.8
	//1. static method with the method body
	// final is NOT allowed
	
	//method hiding: static method can not be overwritten
	public static void taxCalculation() {
		System.out.println("US - taxCalculation");
		//can NOt override in FortisHospital
	}
	
	public static void pharmacyServices() {
		System.out.println("US - pharmacyServices");
		//can NOt override in FortisHospital
	}

	//2. default methods: not static--> purpose??- interface can take a decision , 
	//to implement business logic
	default void getMedicalServices() {
		System.out.println("US - getMedicalServices, using default");
	}
	
	//encapsulation- hiding PrIVATE data members
	//ABSTRACTION- hiding implementation(interface), not static
}
