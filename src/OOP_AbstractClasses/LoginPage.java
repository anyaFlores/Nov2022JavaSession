package OOP_AbstractClasses;

public class LoginPage extends Page{
	
	
	public LoginPage() {
		System.out.println("LoginPage(child class) --constractor...");
	}
	
	public LoginPage(int i) {
		System.out.println("LoginPage(child class) ----constractor..." + i);
	}

	//child class responsibility to implement methods
	@Override
	public void title() {
		System.out.println("LoginPage----title");
	}

	@Override
	public void url() {
		System.out.println("LoginPage----url");
	}

	public void resetPwd() {
		System.out.println("LoginPage----resetPwd");
	}
	
	//Can Not override
//	public final void displayLogo() {
//		System.out.println("Page ----logo");
//	}
	@Override
	public void pageLoadingTime() {
		System.out.println("pageLoadingTime 5 sec");
	}
	
	//can not override by Method hiding
	public static void pageCycle() {
		System.out.println("LoginPage ----pageCycle");
	}

    @Override
	public void privacyPolicy() {
		System.out.println("LoginPage ----privacyPolicy");
	}

}
