package Assignment;

import java.util.Scanner;

public class Method_Average {
	static int averageValue = 0;
	public static int  qualityPoints(int marks) {
		if(marks < 60) {
			averageValue = 0;
		}
		else if(marks >= 60 && marks < 70) {
			averageValue = 1;
		}
		else if(marks >= 70 && marks < 80) {
			averageValue = 2;
		}
		else if(marks >= 80 && marks < 90) {
			averageValue = 3;
		}
		else if(marks >= 90 && marks <= 100) {
			averageValue = 4;
		}
		else
			System.out.println("Invalid value entered.");

		return averageValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student: ");
		System.out.println("The average result of the student is: " + qualityPoints(sc.nextInt()));	
	}
}
