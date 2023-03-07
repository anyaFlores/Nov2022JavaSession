package SeleniumSessions;

public class MethodsInJava {
	//data members:
	//1. class vars(obj variables)
	//2. class methods(actions of a particular class)
	
	// function:
	//functions are independent
	//can not create a function inside a function
	//2+2 = 4
	
	//1. no input and no return
	//void: no return: function can not return anything
	//return type: void
	public void test() {
		System.out.println("test method");
		//return;//return null->nothing
 	}
	
	//2. no input and some return:
	//return type : int
	public int getBillAmountTest() {
		System.out.println("get bill amount");
		int foodBills = 100;
		int drinkBills = 50;
		int totalAmount = foodBills+drinkBills;
		return totalAmount;//it will give you smth and we can use it for the other transactions
	}
	
	
	public String getEmployeeName() {
		System.out.println("get employee name");
		String name = "Naveen";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "Selenium";
	}
	
	public int getNumber() {
		return 100;
	}
	
	public boolean isElementExist() {
	System.out.println("check element is present");
	boolean flag = true;
	return flag;
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus-negative;
		return finalMarks;
	}
	
	//3. some input and some return
	// WAF:
	//two variables: a and b
	//return sum of these two numbers
	public int getSum(int a, int b) {//input parameters
		System.out.println("sum of two numbers ......");
		int sum = a+b;
		return sum;
	}
	
	// WAF:
	//two variables:int and double
	//return multiplication of these two numbers
	public double getMultiplication(int x, double y) {
		System.out.println("getMultiplication");
		double mul = x * y;
		return mul;
	}
	
	public String getEmpSalary(String empName, int bonusAmount) {
		System.out.println("emp salary");
		return empName+ ":" +bonusAmount;
	}
	
	//Purpuse on the return: return some function
	public static void main(String[] args) {
		//call the function: Create an object
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		int m1 = obj.getBillAmountTest();//better store in a variable an d use the variable for next function
		System.out.println(m1);
		String emp = obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist()) {
			System.out.println("click on the element");
		}
		
		int s1 = obj.getSum(10, 20);//call a function by passing some values= call by values
		System.out.println(s1);
		int s2 = obj.getSum(40, 50);
		System.out.println(s2);
		
		//parameter = declare a values in the function
		//call in the main method = parameters
		
		double mul1 = obj.getMultiplication(10, 2.2);
		System.out.println(mul1);
		
		String sal = obj.getEmpSalary("ANYA", 500);
		System.out.println(sal);
	}
} 
