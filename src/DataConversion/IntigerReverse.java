package DataConversion;

public class IntigerReverse {

	public static String reverseInt(String number) {

		String reversedNumber = "";
		int len1 = number.length();
		
		//null check
		if(number==null) {
			System.out.println("null is not allowed...enter the right number");
		}
		//Length check
		if(len1==1) {
	System.out.println("only single digit");
			return number;
		}
		
		for(int j = len1 - 1; j>=0; j--) {
			reversedNumber = reversedNumber + number.charAt(j);
		}
		return reversedNumber;
		
	}
	
	
	public static void main(String[] args) {
		

		String n1 = String.valueOf(reverseInt("3"));
		System.out.println(n1);
		
		n1 = String.valueOf(reverseInt("12345"));
		System.out.println(n1);
		n1 = String.valueOf(reverseInt("0"));
		System.out.println(n1);
	}
	


}
