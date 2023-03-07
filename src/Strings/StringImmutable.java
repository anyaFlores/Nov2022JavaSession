package Strings;

public class StringImmutable {

	public static void main(String[] args) {


		String s = "Selenium";
//		s = "Cypress";
//		System.out.println(s);
//		
//		String t = "Selenium";
		
		System.out.println(s+" automation");
		System.out.println(s);//not updating string
		
		s = "Cypress";
		System.out.println(s);
		
		String t1 = "Selenium";
		
		System.out.println(t1);
		
		
		String p = "Naveen";
		p = p + " Automation Labs";
		System.out.println(p);
		
		String t2 = "Naveen";
		System.out.println(t2);
		
		String r = "    hello selenium     ";
		r = r.trim();
		System.out.println(r);

	}

}
