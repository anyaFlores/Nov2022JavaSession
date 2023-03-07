package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		//only default contct fro parent class will be called first
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		lp.privacyPolicy();
		
		Page.pageCycle();//no need to create an obj for static
		LoginPage.pageCycle();
		
		//top casting
		//child class obj can be referred by abstract parent class ref variable:
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		
		//down casting at the run time/compile time?-NA
		
	

	}

}
