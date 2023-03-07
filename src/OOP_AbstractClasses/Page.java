package OOP_AbstractClasses;

public abstract class Page extends GrandparentPage implements Web{
	//2+2
	//0% abstraction: no abstract methods at all
	//x% abstraction: partial abstraction
	//100% abstraction: all abstract methods
	
	//can Not create an Obj of abstract class
	//but can create the Contractor of the abstract class
	//it will be called when we create an obj of the child class
	
	
	//in Parent if we create param constr- always create a default const.
	//Parent class always check for default const
	
	//JVM add default const for us
	public Page() {
		System.out.println("Page(parent class) ---constractor");
	}
	
	public Page(int i) {
		System.out.println("Page(parent class) ---constractor" + i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	
	//Parent class also can implement the logic
	public final void displayLogo() {
		System.out.println("Page ----logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("pageLoadingTime 10 sec");
	}
	
	
	//static method Can Not be Abstract
	public static void pageCycle() {
		System.out.println("Page ----pageCycle");
	}
	
	@Override
	public void privacyPolicy() {
		System.out.println("Page ----privacyPolicy");
	}

}
