package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		// Start->Condition Checking(exit)/Continue checking
		//Run at least ONCE
		int p = 1;
		do {//click CTRL+SPACE
			System.out.println(p);
			if(p==10) {
				break;
			}
			p++;
		} while (p<=50);
		
		//use cases:
		//1. login page(if available -just click on it)
		//2. launch a page: looking for element: 0,5,2,10,20...n

	}

}
