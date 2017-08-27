package oops;

public class ConstructorOverLoading {

	public static void main(String[] args) {
		Rectanglee obj1 = new Rectanglee();
		obj1.printDimensions();
		
		Rectanglee obj2 = new Rectanglee(3, 5);
		obj2.printDimensions();
		
		Rectanglee obj3 = new Rectanglee(obj2);
		obj3.printDimensions();
	}

}

class Rectanglee{
	int length;
	int breadth;
	
	Rectanglee(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	Rectanglee(){
		
	}
	
	Rectanglee(Rectanglee r){
		this.length = r.length;
		this.breadth = r.breadth;
	}
	
	void printDimensions(){
		System.out.println("length " + length);
		System.out.println("breadth " + breadth);
	}
}
