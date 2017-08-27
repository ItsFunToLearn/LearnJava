package oops;

public class ConstructorOverloading2 {

	public static void main(String[] args) {
		Triangle obj1 = new Triangle();
		Triangle obj2 = new Triangle(3);
		Triangle obj3 = new Triangle(2, 3);
		Triangle obj4 = new Triangle(6, 7, 8);
		Triangle obj5 = new Triangle(obj3);
		
		obj1.printDimension();
		obj2.printDimension();
		obj3.printDimension();
		obj4.printDimension();
		obj5.printDimension();
	}

}

class Triangle{
	
	int length;
	int breadth;
	int height;
	
	Triangle(){
		
	}
	
	Triangle(int n){
		this.length = this.breadth = this.height = n;
	}
	
	Triangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	Triangle(int length, int breadth, int height){
		this(length, breadth);
		this.height = height;
	}
	
	Triangle(Triangle t){
		this.length = t.length;
		this.breadth = t.breadth;
		this.height = t.height;
	}
	
	void printDimension(){
		System.out.println("["+ length + " "+ breadth + " " + height +  "]");
	}
}
