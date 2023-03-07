package OOP_Interface;

public class Hospital {
	
	public void medicalRD() {
		System.out.println("Medical R&D");
	}
	public final void medicalNews() {//final to prevent unnecessary method to be overwritten
		System.out.println("Medical News");
	}
}
