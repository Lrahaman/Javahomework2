package Assignment2;

public class FindOddEven {

	public static void main(String[] args) {
		int[] num = { 17, 19, 6, 202, 500, 69 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				System.out.println(num[i] + " This is even number ");
			else if (num[i] % 2 != 0)
				System.out.println(num[i] + " This odd number ");
			else
				System.out.println("unknown");

		} // End of for loop

	}// End of main method

}// End of class
