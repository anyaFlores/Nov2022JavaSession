package Strings;

public class StringConcept {

	public static void main(String[] args) {
	
		//String literals
		String str = "Selenium";
		String str1 = "Selenium";
		String str2 = "selenium";
		
		String t1 = "Java";
		
		System.out.println(str == str1);//compare based on memory address
		System.out.println(str.equals(str1));// compare based on values
		//for non primitive use ==; for string - equals
		
		
		
		System.out.println("--------------");
		String s1 = new String("testing");//2 obj
		String s2 = new String("testing");//1 obj
		String s3 = "testing";//0
		String s4 = "testing";//0
		
		System.out.println(s3 == s4);//true
		System.out.println(s3 == s4);//false
		System.out.println(s1.equals(s2));//true
		
		
		System.out.println(s1 == s3);//false
		
	}

}
