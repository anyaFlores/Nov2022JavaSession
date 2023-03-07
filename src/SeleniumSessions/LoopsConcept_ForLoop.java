package SeleniumSessions;

public class LoopsConcept_ForLoop {

	public static void main(String[] args) {
		// Practical use: select date in the calendar- n-times to click on the arror to
		// select the date, N of iteration Is NOT Fixed.
		// Initialization->Check condition(true->Perform
		// Action->increment/Decrement->)-->End
		// 1 to 10
//		int i=1;
//		for(; i<=10; )can write this way, looks more uglier...
		for (int i = 1; i <= 10;) {// if remove i++ ->the program will always will check i<=1..
			System.out.println(i);// 1 2 3 ...10
			// i++;//or use this way
			// ++1;
			i = i + 1;
		}
		
		
		int x = 10;
		
		x = x + 1;
		
		 for (;;) {
			
	            System.out.println(x+" = "+"BYE");
	          if( x <= 20) {
	        	   	
	        	  System.out.println(x+" = "+"BYE");
	            }
	              
	        }
		// for (initialization; test-condition; update)
		  
//BYE should be print 50 times in this format!!!!!!!!!!!!!!!with initialization
//		int o = 1;
//		for (;;) {
//			if (o >= 50) {
//				System.out.println("Bye");
//
//			}
//			o++;
//
//		}

//for(;true;) {
//System.out.println("Bye");
//}
//Condition Break is IMPPORTANT!!!!
		 //use cases for loop;
		 //1. number of iteration are fixed
		 //2. month/date dropdown :Jan -Dec
		 //3. e-commerce: categories iteration
		 //4. country dropdown
		 //5. age for getting the license 
	}

}
