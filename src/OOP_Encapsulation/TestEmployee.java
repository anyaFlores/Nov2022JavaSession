package OOP_Encapsulation;

public class TestEmployee {
//ENCAPSULATION
	public static void main(String[] args) {
		
		//Getter and Setter-> helps to update the page . Used for assigning and fetching the value
		//it is encapsulation
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		
		e1.setSalary(12.33);
		System.out.println(e1.getSalary() + " " + e1.name + " " + e1.age);
		
		//POST

		Company c1 = new Company();
		c1.setName("IBM");
		c1.setEmpCount(10000);
		c1.setSharePrice(500);
		
		//GET
		System.out.println(c1.getName());
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getSharePrice());//1000
		
		//PUT
		c1.setEmpCount(120000);//Assigned new value
		
		//GET
		System.out.println(c1.getName());
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getSharePrice());//12000

		
		//register
		RegisterPage reg = new RegisterPage("TOM", 25, "23320 Tradewind", "01-01-1990");
		
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		
		reg.setAddress("67 Crosswinds dr");
		System.out.println(reg.getName());
		System.out.println(reg.getAddress());
		
		
		
		//
	
		
	}

}
