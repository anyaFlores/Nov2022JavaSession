package SeleniumSessions;

public class NestedLoopsConcept {

	public static void main(String[] args) {
		//00 01 02 030 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30 ....
		//40 ....
		//50 51 52 53 54 55
// inner loop depends on outer loop
		for( int i = 0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(i+""+j+" ");//00
			//break;break inner loop
			}
			System.out.println();
			break;//break outer loop
			
		}
		System.out.println("-----------------------");
		for(int v=0; v<=5; v++) {
			for(int u=0; u<=5; u++) {
				for(int l=0; l<=0; l++) {
					System.out.println(v+""+u+l+" ");//000
					break;//break 3rd loop
				}
				System.out.println();
				//break;
			}
			break;
		}
		//O(n^3)
	}

}
