package Package;

class Circle extends Shape
{
	public void getArea()
	{
		int r=2;
		double pi=3.14;
		double area = pi*r*r;   // area of  circle
		System.out.println("Area of circle is " + area);  //To print Area
	}
}

class Triangle extends Circle
{
	public void getArea()
	{
		int l = 2;
		int h = 2;
		double area = (l*h)/2; // area of Triangle
		System.out.println("Area of Triangle is " + area);  //To print Area
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Circle c = new Circle(); //Creating object
          c.getArea();   // called method
          Triangle t = new Triangle(); //Creating object
          t.getArea();    //called method 
	}

}
