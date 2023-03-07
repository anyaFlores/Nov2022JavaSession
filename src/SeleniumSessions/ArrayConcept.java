package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// Static array-size is fixed
		// collection of elements with the same type
		
		// limitation of the array-Static. To overcome-->dynamic array(ArrayList)
		//2. only similar type of data
		
		// array is non primitive data type
		// li = 0
		// len = 4
		// hi =len-1
		// len= hi+1
		int i[] = new int[4];
		System.out.println(i.length);
		int len = i.length;
		int hi = len - 1;
		int li = 0;

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[3]);
//System.out.println(i[5]);//AIOB
//System.out.println(i[-1]);//AIOB
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		//print all the values from array:
		for(int k = 0;k<=i.length-1; k++) {
			System.out.println(i[k]);
		}
		int p[] = new int[4];
		p[2]= 30;
		System.out.println(p[0]);//0-didn't assign value
		System.out.println(p[2]);
		System.out.println(p[3]);

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		// to print all the values from array:
		System.out.println(Arrays.toString(i));
		//+ for loop- write a logic
		// arrays.toString - just to print out arrays
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//forEach loop(advanced loop/modern way)/ cant go to the reverse order
		for(int e : i) {
			System.out.println(e);
			if(e==20) {
				System.out.println("bye!");
				break;
			}
		}
		
		//2. double array
		double d[] = new double [4];
		d[0]= 12.33;
		d[1] = 23.44;
		d[2]= 34.55;
		d[3] = 45.66;
		System.out.println(d[0]+d[1]);
		System.out.println(Arrays.toString(d));
		
		for(double e : d) {
			System.out.println(e);
		}
		
		//char:
		char ch[] = new char[49];
		ch[0]= 'a';
		ch[1] = 'b';
		ch[2]= '$';
		ch[3] = 'd';
		System.out.println((ch.length-1));
		//lowest index always 0
		System.out.println(("li = "+0));
		for(char e : ch) {
			System.out.println(e);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//String array: default value of String 'null'
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet";
		System.out.println(lang.length);
		
		for(String e : lang) {
			System.out.println(e);
			if(e.equals("Java")) {
				System.out.println("I Love Java");
			}
			if(e.equals("JavaScript")) {
				System.out.println("I hate JavaScript");
			}
		}
		//Object Array:
		//Object is a class in Java -- is a super class of all the classes in Java
		
		//Emp Info: Name(String), age(int), salary(double), gender(char), isPermanent(boolean):
		Object empInfo[] = new Object[5];// when we dont know the value of the array
		empInfo[0] = "Rashimi";
		empInfo[1] = "25";
		empInfo[2] = 25.55;
		empInfo[3] = 'f';
		empInfo[4]= true;
		
		System.out.println(empInfo.length);
		for(Object e : empInfo) {
			System.out.println(e);
			if(e.equals("Rashimi")) {
				System.out.println("emp is for QA");
			}
		}
		//1. new keyword
		//2. array literals:
		int num[] = {22,35,4,32,678,876};//aware of values in advance. Memory size = 7*4=28MB
		System.out.println(num.length);
		//Practical use:
		//1. flight booking, movie tickets
		//2. gender drop down
		//3. 
}
}