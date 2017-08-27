package oops;

public class CallToThis {
	public static void main(String[] args) {
		D obj = new D();
	}
}

class D{
	D(){
		this(10);
		System.out.println("Default constructor");
	}
	
	D(int i){
		System.out.println("One argument constructor");
	}
}
