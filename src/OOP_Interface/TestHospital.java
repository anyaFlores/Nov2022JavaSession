package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// obj of FH
		
		FortisHospital fh = new FortisHospital();
		//coming from parent interfaces
		fh.cardioServices();
		fh.neuroServices();
		fh.phsycoServices();
		fh.entServices();
		fh.dentalServices();
		fh.oncologyServices();
		
		//common-overritten
		fh.emergencyServices();
		
		//indiv
		fh.medicalInsurance();
		fh.medicalTraining();
		
		//inherited
		fh.medicalRD();
		fh.medicalNews();
		
		fh.covidVaccination();
		
		System.out.println("Fee from  " + fh.min_fee);
		System.out.println("Fee from USMedical " + USMedical.min_fee);
		
		
		USMedical.taxCalculation();
		
		fh.getMedicalServices();//availible in parent interface
		
		//FortisHospital.taxCalculation();//with child class name- cant access
		
		//USMedical.min_fee - its a final, cant bee reassigned
		//NA
		//USMedical us = new USMedical();.
		
		//top casting
		//child class obj can be refrred by parent interface ref variable
 // us -reference(inside stack memory)
		//new FortisHospital() obj =inside by heat memory
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.phsycoServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		
		IndiaMedical in = new FortisHospital();
		in.oncologyServices();
		in.gynServices();
		in.emergencyServices();
		
		//down casting ? at the compile time? Can we create obj of parent interface???-NOOO
		//down casting -parent obj cant be 
		//FortisHospital fh1 = new UKMedical();
		
		//use constantans:
		System.out.println(Constants.OK_MESSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
		System.out.println(Constants.DEFAULT_PAGE_LOAD_TIME_OUT);
	}

}
