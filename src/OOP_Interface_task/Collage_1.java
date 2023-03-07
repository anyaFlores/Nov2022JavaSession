package OOP_Interface_task;

public class Collage_1 extends CentralUniversity implements USCollage, UkraineCollage, FranceCollage{
//US
	@Override
	public void frenchLanguageSubject() {
		System.out.println("Collage_1--------frenchLanguageSubject");
	}
	@Override
	public void artsSubject() {
		System.out.println("Collage_1--------artsSubject");
	}
	@Override
	public void historySubject() {
		System.out.println("Collage_1--------historySubject");
	}
	
	//Ukraine
	@Override
	public void ukrainianLanguageSubject() {
		System.out.println("Collage_1--------ukrainianLanguageSubject");
	}
	@Override
	public void businessManagementSubject() {
		System.out.println("Collage_1--------businessManagementSubject");
	}
	//France
	@Override
	public void mathSubject() {
		System.out.println("Collage_1--------mathSubject");	
	}

	@Override
	public void englishSubject() {
		System.out.println("Collage_1--------englishSubject");
	}
	@Override
	public void philosophySubject() {
		System.out.println("Collage_1--------philosophySubject");
	}
	
//common
	@Override
	public void computerSienceSubject() {
		System.out.println("Collage_1--------computerSienceSubject");
	}
	
	//individ
	
	public void musicSubject() {
		System.out.println("Collage_1--------musicSubject");
	}
	
	public void archaelogySubject() {
		System.out.println("Collage_1--------archaelogySubject");
	}
	@Override
	public void sociologySubject() {
		System.out.println("Collage_1--------sociologySubject");
		
	}
	@Override
	public void economicsSubject() {
		System.out.println("Collage_1--------economicsSubject");
		
	}
	
	
	

}
