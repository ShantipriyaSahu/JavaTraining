package Assignment;

class Vehicle
{
	String regno;
	int model;
	Vehicle(String r, int m)
	{
		regno=r;
		model=m;
	}
	void display()
	{
		System.out.println("Registration no: "+regno);
		System.out.println("Model no: "+model);
	}
}

class Twowheeler extends Vehicle
{
	int noOfWheel;
	Twowheeler(String r,int m,int n)
	{
		super(r,m);
		noOfWheel=n;
	}
	void display()
	{
		System.out.println("Two wheeler tvs");
		super.display();
		System.out.println("No. of wheel : " +noOfWheel);
	}
}


public class Inheritance_VehicleDemo {
	public static void main(String arg[])
	{
		Twowheeler t1;
		t1=new Twowheeler("TN67 12345", 1,2);
		t1.display();
	}
}
