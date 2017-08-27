package oops;
//Process of hiding the implementation and providing only required features for users.

abstract class Car{
	abstract void start();
	abstract void move();
	abstract void stop();
}

class Audi extends Car{
	void start(){
		System.out.println("Audi starts");
	}
	
	void move(){
		System.out.println("Audi moves");
	}
	
	void stop(){
		System.out.println("Audi stops");
	}
}

class Nano extends Car{
	void start(){
		System.out.println("Nano starts");
	}
	
	void move(){
		System.out.println("Nano moves");
	}
	
	void stop(){
		System.out.println("Nano stops");
	}
}

class Driver{
	void drive(Car c){
		c.start();
		c.move();
		c.stop();
	}
}

public class AbstractionExampleUsingAbstractClass {

	public static void main(String[] args) {
		
		Car a = new Audi();
		Car n = new Nano();
		
		Driver d = new Driver();
		d.drive(a);
		d.drive(n);
		
	}

}
