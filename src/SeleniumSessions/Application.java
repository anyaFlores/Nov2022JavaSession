package SeleniumSessions;

public class Application {
	// Method Overloading:
	//within the same class: we have different methods:
	//1. with the same name
	//2. with different number of parameters with different types
	//3. with different sequeince
	//4. return type doesnt matter
	
	//POLY(Many) +Morphhism(Form)- OOP(concept)
	// compile time (static) polymorphism 
	
	//Phyton is not compile time - makes decision at run time. Java is faster(more lines of code)-super fast
	public void test() {// 0 param
		
	}
	public void test(int i) {//1 param
		
	}
	public void test(String i) { //1 param
		
	}
	public void test(int i, int j) { // 2 param
		
	}
	public void test(int i, String j) { // 2 param
		
	}
	public void test(String i, int j) { //2 param
		
	}
    // examples:
	// login:
	public void login() {
		
	}
	public void login(String username, String pwd) {
		
	}
	public void login(String username, String pwd, String role) {
		
	}
	public void login(String username, String pwd, String role, int otp) {
		
	}
	//search:
	public void search() {
		
	}
	public void search(String productName) {
		
	}
	public void search(String productName, int price) {
	
	}
	public void search(String productName, int price, String color) {
		
	}
	
	// payment:
	public void doPayment(String cc, String cvv) {
		
	}
	public void doPayment(String upi) {
		
	}
public void doPayment(String un, String pwd, int opt) {
		
	}
	
	public static void main(String[] args) {
Application obj = new Application();
obj.test();
obj.test(20);
obj.test("Anya");


		}

}
