package SeleniumSessions;

public class LoopsConcept_WhileLoop {

	public static void main(String[] args) {
		//1 to 10
		// WhileLoop: START->CONDITION CHECKING(false->EXIT)->STATEMENT(true)
		int i = 0;//could be negative -10, byte
		while(i<=12) {
			System.out.println(i);//infinity loop 1(without i++); 
			i++;//1-10, have to come out of the loop!!!!DO NOT FORGET TO INCREASE THE VALUE BY 1
			//++i;
			i = i+1;
		}
while(true) {//to generate messages
	System.out.println("Welcome to the Anya's hotel");
	break;//can be used with the Loops!	
}
System.out.println("____---------------------------------------------------------");
int num = 1;
while(num<=100) {
	System.out.println(num); //if element = to login/empl name->print "hi"
	if(num % 5 ==0){
		System.out.println("ALOHAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!");
		//break;// can be written with WhileLoop- it prints only 1 time
	}
	num++;
}
int n = 1;
while(n<=5) {
	System.out.println(n+" = "+"WHAT????");//print w/number->concat
	n++;//or ++n;
}
//
int counter = 100;
while(counter>=100) {//not right condition- infinity Loop
	if(counter== 200) {//check condition->true->break entire loop
		System.out.println("BYE!!!");
		break;
		
	}
counter++;
}
//
int score = 0;
while(score<=100){
System.out.println(score);
if(score ==25) {
	System.out.println("Your score is 25....yay");//when the score is 25- prints the msg
}
if(score ==50) {
	System.out.println("Half century");
}
if(score ==100) {
	System.out.println("Century");
}
score++;
}
switch(score) {
case 25:
	System.out.println("Your score is 25....yay");
	break;// BREAK only Switch loop, not entire WhileLoop
case 50:
	System.out.println("Half century");
	break;
case 100:
	System.out.println("century");
	break;
	
	default:
		System.out.println(score);
		break;//no score++ inside default
}
score++;

//while loop use cases:
//1. when number of iterations are not fixed
//2. infinity loading: Linkedin, swiggy, fb
//3.waiting for element on the page: 5,0,15,20
//4. waiting for the page load: 5 sec, 10, 20,2,20
//5. calendar(select future date, click errors)
//6. pagination in webtable (employees on the n-page; webTable with so many pages in there)
	}
}
