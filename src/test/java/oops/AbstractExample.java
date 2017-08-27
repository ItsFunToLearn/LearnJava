package oops;

abstract class Shape{
	abstract void getArea(int length, int breadth);
}

class Circle extends Shape{

	@Override
	void getArea(int length, int breadth) {
		System.out.println("Inside circle");
		
	}
	
}

class Polygon extends Shape{

	@Override
	void getArea(int length, int breadth) {
		System.out.println("Inside polygon");
		
	}
	
}

public class AbstractExample {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.getArea(2, 4);
		
		Polygon p = new Polygon();
		p.getArea(3, 2);
	}

}
