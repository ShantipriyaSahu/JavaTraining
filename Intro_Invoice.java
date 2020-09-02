package Assignment;

import java.io.IOException;
import java.util.Scanner;

public class Intro_Invoice {
	String part_num;
	String part_des;
	int num_of_items;
	double price_of_items;
	double amount;

	Intro_Invoice()
	{
		part_num=null;
		part_des=null;
		num_of_items=0;
		price_of_items=0.0;
	}

	public String get_part_num()throws IOException
	{
		return part_num;
	}
	
	public String get_part_des()throws IOException
	{
		return part_des;
	}
	
	public int get_num_of_items()throws IOException
	{
		return num_of_items;
	}
	
	public double get_price_of_items()throws IOException
	{
		return price_of_items;
	}
	
	public String set_part_num(String num)
	{
		return (part_num=num);
	}
	
	public String set_part_des(String des)
	{
		return (part_des=des);
	}
	
	public int set_num_of_items(int numitem)
	{
		return (num_of_items=numitem);
	}
	
	public double set_price_of_items(double price )
	{
		return (price_of_items=price);
	}
	
	public double Invoice_amount()
	{
		amount = price_of_items*num_of_items;
		amount = (amount>0)?amount:0;
		return amount;
	}
	public void displayInfo()
	{
		System.out.printf("part number\t"+part_num+"\tpart description\t"+part_des+"\tnum_of_items\t"+num_of_items+"\tprice_of_items\t"+price_of_items);
		System.out.printf("\n Amount \t"+amount);
		System.out.println();
	}

	public static void main( String args[] ){
		Intro_Invoice inv1 = new Intro_Invoice();
		Intro_Invoice inv2 = new Intro_Invoice();
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter part number: ");
			inv1.set_part_num(sc.next());

			System.out.println("Enter part description: ");
			inv1.set_part_des(sc.next());

			System.out.println( "Enter quantity of the item being purchased: " );
			inv1.set_num_of_items(sc.nextInt());

			System.out.println("Enter price per item: ");
			inv1.set_price_of_items(sc.nextDouble());
			
			inv1.Invoice_amount();
			inv1.displayInfo();
			
			System.out.println("Enter part number: ");
			inv2.set_part_num(sc.next());

			System.out.println("Enter part description: ");
			inv2.set_part_des(sc.next());

			System.out.println( "Enter quantity of the item being purchased: " );
			inv2.set_num_of_items(sc.nextInt());

			System.out.println("Enter price per item: ");
			inv2.set_price_of_items(sc.nextDouble());

			inv2.Invoice_amount();
			inv2.displayInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
