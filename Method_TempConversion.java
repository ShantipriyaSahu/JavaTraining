package Assignment;

import java.util.Scanner;

public class Method_TempConversion {
	static Scanner scan = new Scanner(System.in);
	static int selection;
	double convert;
	double temp;

	public void celciousToFahrenheit() {
		System.out.println("Enter celsius temperature: " );
		temp = scan.nextDouble();
		convert = (temp * 9 / 5) + 32;
		System.out.println(temp + " degree C = " + convert +"degree F");
	}

	public void fahrenheitToCelcious() {
		System.out.println("Enter fahrenheit temperature: " );
		temp = scan.nextDouble();
		convert = (temp - 32) * 5 / 9;
		System.out.println(temp + " degree F = " + convert +"degree C");
	}

	public static void main(String[] args) {
		Method_TempConversion t1 = new Method_TempConversion();
		do {
			System.out.println("***********************************************");
			System.out.println( "Main Menu" );
			System.out.println( "Enter 1 for Fahrenheit to Celsius equivalent " );
			System.out.println( "Enter 2 for Celsius to Fahrenheit equivalent" );
			System.out.println( "3 to Exit\n " );
			System.out.print( "Selection: " );
			selection = scan.nextInt();

			switch (selection)
			{
			case 1:t1.fahrenheitToCelcious();
			break;

			case 2:t1.celciousToFahrenheit();
			break;

			case 3:
				break;

			default:
				System.out.println( "Invalid selection" );
			}

		} while (selection == 1 || selection == 2);
	}
}
