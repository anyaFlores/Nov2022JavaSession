package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<String>();//List is Interface; topcasting
		//can not create obj of Interface 'List'
		namesList.add("Tom");
		namesList.add("Peter");
		namesList.add("Rashmi");
		namesList.add("Ravi");
		namesList.add("Peter");
		namesList.add("Naveen");
		
		System.out.println(namesList);//just to see all elements
		System.out.println(namesList.size());
		
		//condition- to use condition
		for(String e : namesList) {
			System.out.println(e);
			if(e.equals("Rashmi")) {//stop at Rashmi
				System.out.println("she is the manager");
				break;
			}
		}
		
		//shortcuts
		List<String> browserList = Arrays.asList("chrome", "firefox", "IE", "Safari", "Edge");//asList - is static method
		System.out.println(browserList.size());
		System.out.println(browserList);

		List<Integer> numberList = Arrays.asList(100, 200, 300,400, 500);
		
		//static array to dynamic array:
		
		String country[] = {"USA", "India","Ukraine","Germany"};//it is a static array because we use []
		List<String> countryList = Arrays.asList(country);//convert into dynamic array
		//asList is Immutable- cant change anything
		
		//if you want to add value - add at line 41
		System.out.println(countryList);
		
		countryList.add("France");
		System.out.println(countryList);//UnsupportedOperationException
		
	}

}
