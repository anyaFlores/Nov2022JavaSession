package SeleniumSessions;

public class Student {

	
		// WAF:
		//give the studentName(String) as a parameter
		//return the student marks(int)
		public int getStudentMarks(String studentName) {
			System.out.println("getting student marks for :" + studentName);
			if(studentName.equals("ANYA")) {
				return 100;
			}
			else if(studentName.equals("MISHA")) {
				return 40000;
			}
			else if(studentName.equals("LANA")) {
				return 9000;
			}
			
			else {
				System.out.println("student is not found...");
				return -1;//if nothing is get satisfied 
			}
			}
				
				
		public static void main(String[] args) {//JVM call main method, should be void, never return anything
			
			Student st = new Student();
			int m1 = st.getStudentMarks("LISA");
			System.out.println(m1);
			if(m1==-1) {
				System.out.println("no need to print anything");
			}
//write a logic with switch case
	}

}
