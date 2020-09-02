package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_EliminateDuplicate {
	static int entered = 0;
	int[] array = new int[5];
	public void getNumbers() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		while (entered < array.length)
		{
			System.out.println("Enter number: ");
			num = input.nextInt();
			if ((num < 10) || (num > 100)) {
				System.out.println("Number " + num + " is invalid should be betwwen 10 and 100");
				continue;
			}
			int i;
			for( i = 0; i < entered; ++i) {
				if(num == array[i]) {
					System.out.println("Number is a duplicate");
					break;
				}
			}
			if(i == entered) {
				array[entered++] = num;
				continue;
			}

		}	
	}

	public void sorting() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int text:array) {
	         list1.add(text);
	      }
		Collections.sort(list1);
	    System.out.println(list1);

	}

	public static void main(String[] args) {
		Array_EliminateDuplicate d = new Array_EliminateDuplicate();
		d.getNumbers();
		d.sorting();
	}
}


