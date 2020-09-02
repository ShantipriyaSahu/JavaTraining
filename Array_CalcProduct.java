package Assignment;

public class Array_CalcProduct {

	public static int product(int... numbers) {
		int product = 1;
		for (int number : numbers) {
			product *= number;
		}
		return product;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3 ,4, 5};
		System.out.println("Product of 2 numbers: " + product(a[0], a[1]));
		System.out.println("Product of 3 numbers: " + product(a[0], a[1], a[3]));
		System.out.println("Product of 4 numbers: " + product(a[0], a[1], a[2], a[3]));
	}
}
