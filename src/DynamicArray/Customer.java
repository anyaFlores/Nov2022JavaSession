package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
	
		List<String> namesList = new ArrayList<String>();//List is Interface; topcasting
		//can not create obj of Interface 'List'
		namesList.add("Tom");//0
		namesList.add("Peter");//1
		namesList.add("Rashmi");//2
		namesList.add("Ravi");//3
		namesList.add("Naveen");//4

//		for(int i = namesList.size()-1; i>=0; i--) {
//			System.out.println(namesList.get(i));
//		}
		
		System.out.println(namesList);
		//Collections.reverse(namesList);
//		Collections.sort(namesList);//Alphabetically 
//		Collections.swap(namesList, 2, 3);
		
		//namesList.add("Amrita");
		//namesList.add(0, "Kathy");//[Kathy, Tom, Peter, Rashmi, Ravi, Naveen, Amira]
		//namesList.add(7, "Vinutha");//IndexOutOfBoundsException: Index: 7, Size: 5- ArrayList -order based collection-maintains order
		//System.out.println(namesList.get(5));//IndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		namesList.remove(1);
		System.out.println(namesList.get(1));
		System.out.println(namesList);

	}

}
