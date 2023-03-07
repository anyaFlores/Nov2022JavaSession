package MethodCalling;

public class Employee {
	String name;
	int age;
	
	public int add(int a, int b) {
		System.out.println("sum of two numbers");
		int sum = a+b;
		return sum;
	}
	
	public void getInfo(Employee emp) {//Employee type
//		
		emp.name = "Anya";
		emp.age = 26;
		System.out.println(emp.name + " " + emp.age);
	}
	public static void main(String[] args) {

		Employee e1 = new Employee();
		//e1.add(10,20); //call by value
		//System.out.println(e1.name + " " + e1.age);
		
		e1.name = "Masha";
		e1.age = 30;
		
		e1.getInfo(e1);//call by reference - we dont supply by value, we pass it by obj
		
		System.out.println(e1.name + " " + e1.age);

	}

}
