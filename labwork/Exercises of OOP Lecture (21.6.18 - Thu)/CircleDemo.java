/* This is a demonstration that how to convert your 
   UML diagram into .java code*/


public class CircleDemo{
	
	public static void main(String []args){

		Circle a = new Circle(10,"Green");
		Circle b = new Circle(20);

		System.out.println("Radius of Circle a : "+a.getRadius());
		System.out.println("Color of Circle a : "+a.getColor());
		System.out.println("Area of Circle a : "+a.getArea());
		System.out.println("Circumference of Circle a : "+a.getCircumference());
		System.out.println("a : "+a.toString());
	
		System.out.println();

		System.out.println("Radius of Circle b : "+b.getRadius());
		System.out.println("Color of Circle b : "+b.getColor());
		System.out.println("Area of Circle b : "+b.getArea());
		System.out.println("Circumference of Circle b : "+b.getCircumference());	
		System.out.println("b : "+b.toString());

		System.out.println();


		Circle c = new Circle();

		c.setRadius(21);
		c.setColor("Orange");

		System.out.println("c : "+c.toString());


	}

}





class Circle{

	private double radius = 1.0;
	private String color = "red";

	public Circle(double radius){

		this.radius = radius;

	}

	public Circle(double radius, String color){

		this(radius);
		this.color = color;
	}


	
	public Circle(){}


	public double getRadius(){

		return radius;

	}

	public void setRadius(double radius){

		this.radius = radius;

	}

	public String getColor(){

		return color;
	}

	public void setColor(String color){

		this.color = color;

	}

	public String toString(){

		return (String.format("Circle[radius=%f, color=%s]",getRadius(),getColor()));

	}
	
	public double getArea(){

		return (Math.PI * (Math.pow(getRadius(),2) ));
	

	}

	public double getCircumference(){

		return (2D * Math.PI * getRadius());


	}
	

}	// end of class "Circle"