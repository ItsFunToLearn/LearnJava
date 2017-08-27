package oops;

public class ConstructorExample {

	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj);

	}
}

class C {

	C() {
		System.out.println("Inside default constructor");
	}
}
