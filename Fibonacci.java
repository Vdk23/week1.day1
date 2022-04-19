package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {

		int range = 8;
		int a = 0;
		int b = 1;
		int sum;

		System.out.println(a);

		for (int i = 1; i <= range; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);

		}
	}

}
