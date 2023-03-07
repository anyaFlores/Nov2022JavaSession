package DataConversion;

public class IntReverse_intiger {

	public static void main(String[] args) {
		int number = 1234567;
		int reverse = 0;
		while (number != 0) {
			int reminder = number % 10;//123 % 10 = 3
			System.out.println("This is reminder " + reminder);
			reverse = reverse * 10 + reminder;
			System.out.println("This is reverse" + reverse);
			number = number / 10;
			System.out.println("This is number"+number);
		}

	}

}
