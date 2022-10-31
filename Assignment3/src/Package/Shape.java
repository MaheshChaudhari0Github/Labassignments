package Package;

class Circle extends Shape //child class 
{
// inheritance concept
public void areaOfCircle() // method of circle class
{
	 double pi=3.14;
	 int r=8;
	 double area=pi*r*r;  //calculate area of circle
	 System.out.print("Area of circle is :"+area);
}
} 

class Triangle extends Shape  // child class
{
public void areaOfTriangle()// method of Triangle class
{
	int b=4;
	int h=6;
	double area=(b*h)/2;//calculate area of Triangle
	  System.out.print("Area of Triangle is :"+area);
}
}

public class Shape {

public void Area()  // method of shape class
{
	System.out.print("Shape :");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Circle c = new Circle();
	Triangle t = new Triangle();
	
	c.areaOfCircle();  // method call from circle class 
	System.out.println();
	t.areaOfTriangle(); //method call from Triangle class
	}

}
