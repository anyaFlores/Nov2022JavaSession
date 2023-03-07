package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkRAM();
		launchcheckVersion();
		checkOS();
		checkBrowserServices();
	}
	//Unnecessary methods make them PRIVATE
	private void checkRAM() {
		System.out.println("checkRAM");
	}
	
	private void launchcheckVersion() {
		System.out.println("check version");
	}
	
	private void checkOS() {
		System.out.println("check OS");
	}
	
	private void checkBrowserServices() {
		System.out.println("check browser services");
	}
	

}
