package Assignment;

public class ControlStatII_Factorial {
	public static void main(String[] args) {

		{
			String output="X\tX!\n";

			int number=1;
			int x = 1;

			for(int a=1;a<=20;a++)
			{
				x=a;

				for(int b=1;b<=a;b++)
					number=number*b;
			}

			//System.out.printf("%d","\n"+ x +"\t"+number);
			System.out.println(x+"\t"+number);

		}
	}
}
