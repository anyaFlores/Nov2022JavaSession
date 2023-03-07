package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndiaMedical{//4 parents: 1 class and 3 interfaces 
	int min_fee = 50;
	
	//US
	@Override
	public void cardioServices() {
		System.out.println("FH--- cardioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH--- neuroServices");
		
	}

	@Override
	public void phsycoServices() {
		System.out.println("FH--- phsycoServices");	
		
	}
//UK
	@Override
	public void entServices() {
		System.out.println("FH--- entServices");	
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH--- dentalServices");	
		
	}
	
    //India
	@Override
	public void oncologyServices() {
		System.out.println("FH--- oncologyServices");	
	}

	@Override
	public void gynServices() {
		System.out.println("FH--- gynServices");	
		
	}

	//Common
	@Override
	public void emergencyServices() {
		// only 1 time from IndiaMedical-coz ot is the last
		
	}
		
	
    //Individual
	public void medicalTraining() {
		System.out.println("FH--- medicalTraining");	
		
	}
	
	public void medicalInsurance() {
		System.out.println("FH--- medicalInsurance");	
		
	}
//should be implements at the lowest level-class level
	@Override
	public void covidVaccination() {
		System.out.println("FH--- covidVaccination");
		
	}

	@Override
	public void childCareServices() {
		System.out.println("FH--- childCareServices");
		
	}
	
	//Override default interface method
	@Override
	public void getMedicalServices() {
		System.out.println("FH--- getMedicalServices, changing from default to public ");
		
	}
	}


