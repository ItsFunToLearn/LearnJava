package oops;


//Represents current instance. It is used to refer non static variables of current instance
public class ThisKeyword {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.init(2, 3);
		obj.printDimension();
		obj.getArea();
	}
}

class Rectangle{
	int length;
	int breadth;
	
	void init(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void printDimension(){
		System.out.println("Dimensions " + "[" + length + " , " + breadth + "]" );
	}
	
	void getArea(){
		System.out.println("Area " + (length*breadth));
	}
}
