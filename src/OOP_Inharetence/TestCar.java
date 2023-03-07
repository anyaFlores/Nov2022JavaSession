package OOP_Inharetence;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//Overridden 
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual of BMW
		BMW.billing();//can inherit with CLASS name
		Car.billing();
		BMW.display();//static in nature-can inherit
		b.running();//inherited 
		b.payment("naveen@alalalal");
		b.engine();
		
		System.out.println("------------Audi-------------");
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();
		
		
		
		System.out.println("_----------");
		Car c = new Car();//access only methods  are inside Parent class
		c.start();//
		c.stop();
		c.refuel();
		c.payment("anya@1234.com");
		c.engine();
		
		
		System.out.println("----------");
		
		//Top Casting-->child class obj can be referred by parent class ref variable
		//Top/Up Casting
		Car c1 = new BMW();//new BMW(); -child class obj
		//c1-parent class name variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.petrolEngine();
		//c1.autoParking()-not allowed
		
		
		//Top Casting-->child class obj can be referred by Grandparent class ref variable
		//Top/Up Casting
		Vehicle v = new BMW();
		v.petrolEngine();
		v.engine();
		 		
		//Down casting--> NEVER DO
		//Parent class obj can be reffered by child class ref variable
		BMW b1 = (BMW)new Car();//how can we conver car into BMW? // ClassCastException at runtime
		//parent class obj new Car() we converted into BMW
		//NOT EVERY CAR IS BMW- no usecase
		
		//at the compile time
		BMW b2 = (BMW)new Vehicle();
		
	}

}
