package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 10;
		boolean flag = false;
		//Here, note that we are looping from 2 to num/2. It is because a number is not divisible by more than its half.


		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				flag = true;

				break;

			}

		}
		if (flag != true) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}
}
