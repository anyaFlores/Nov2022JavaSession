package OOP_Interface_task;

public class TestCollage {

	public static void main(String[] args) {
		Collage_1 c1 = new Collage_1();
		//coming from parent interfaces
		c1.mathSubject();
		c1.englishSubject();
		c1.philosophySubject();
		
		c1.ukrainianLanguageSubject();
		c1.businessManagementSubject();
		
		c1.frenchLanguageSubject();
		c1.artsSubject();
		c1.historySubject();
		
		//common-overritten
		c1.computerSienceSubject();
		
		//indiv
		c1.musicSubject();
		c1.archaelogySubject();
		
		//WorldWideEducationSystem
		c1.sociologySubject();
		
		//NOVA_US
		c1.economicsSubject();
		
		//inherited
		c1.literatureSubject();
		c1.religionAndReligiousStudiesSubject();
		//top casting
				//child class obj can be refrred by parent interface ref variable
		 // us -reference(inside stack memory)

		USCollage usCol = new Collage_1();
		usCol.mathSubject();
		usCol.englishSubject();
		usCol.philosophySubject();
		usCol.computerSienceSubject();
		
		UkraineCollage ukrCol = new Collage_1();
		ukrCol.ukrainianLanguageSubject();
		ukrCol.businessManagementSubject();
		ukrCol.computerSienceSubject();
		
		FranceCollage frCol = new Collage_1();
		frCol.frenchLanguageSubject();
		frCol.artsSubject();
		frCol.historySubject();
		frCol.computerSienceSubject();
		
		

		

	}

}
