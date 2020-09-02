package Assignment;

import java.util.Scanner;

public class Object_Rectangle {

	private float length, width;
	public Object_Rectangle(){
		length = 1;
		width = 1;
	}

	public float doPerimeter(){
		return (length+width)*2;
	}

	public float doArea(){
		return length*width;
	}

	public float getLength(){
		return length;
	}

	public float getWidth(){
		return width;
	}

	public void setLength(float length){
		if (length > 0.0 && length < 20.0)
			this.length = length;
	}

	public void setWidth(float width){
		if (width > 0.0 && width < 20.0)
			this.width = width;
	}

	public boolean isSquare()
	{
		if (length == width)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Object_Rectangle re = new Object_Rectangle();
		System.out.println("Area and perimeter of default rectangle ");
		displayRectData(re);
		System.out.println("Area and perimeter of  new rectangle");
		re.setLength(13);
		re.setWidth(17);
		displayRectData(re);

	}

	public static void displayRectData(Object_Rectangle r) {
		System.out.println("Current Dimensions:\n "+ r.getLength()+" , "+ r.getWidth());
		System.out.printf("Area of Rectangle: %.2f\nPerimeter of Rectangle: %.2f\n\n", r.doArea(), r.doPerimeter());
	}
}

