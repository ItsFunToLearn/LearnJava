package oops;

class Animal{
	void move(){
		System.out.println("Running");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("meow meow");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("bow bow");
	}
}

class Snake extends Animal{
	void move(){
		System.out.println("Crawling");
	}
	
	void makeSound(){
		System.out.println("hiss hiss");
	}
}

public class InheritanceExample2 {
	
	public static void main(String[] args) {
		System.out.println("CAT");
		Cat c= new Cat();
		c.makeSound();
		c.move();;
		
		System.out.println("DOG");
		Dog d= new Dog();
		d.makeSound();
		d.move();
		
		System.out.println("SNAKE");
		Snake s = new Snake();
		s.makeSound();
		s.move();
	}

}
