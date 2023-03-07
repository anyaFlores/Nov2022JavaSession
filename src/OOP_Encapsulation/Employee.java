package OOP_Encapsulation;

public class Employee {
	public String name;
	public int age;
	private double salary;//no one can access
	
	// PUBLIC(so we can access) getter and setter:
	//Encapsulating private data in Public methods, giving extra level of security
			public double getSalary() {//no need obj coz it is not static
				return salary;
			}
			
			public void setSalary(double salary) {
				this.salary = salary;
			}

}
