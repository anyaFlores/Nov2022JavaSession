package AccMod1;

public class Car {

	public String name;
	private static int price;//has to accessed in a static way
	protected String color;
	String seller;
	
	public static void main(String[] args) {
		
		final int i = 10;//local variable:static , protected, public-->Not allowed
		Car c = new Car();
		c.price = 100;
		

	}

}
