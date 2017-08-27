package oops;

public class ConstructorChain {
	public static void main(String[] args) {
		I obj = new I();
	}
}

class G {
	G() {
		System.out.println("Inside constructor G");
	}
}

class H extends G {
	H() {
		super();
		System.out.println("Inside default constructor H");
	}

	H(String s) {
		this();
		System.out.println("Inside String argument constructor H");
	}

	H(int i) {
		this("rathna");
		System.out.println("Inside integer argument constructor H");
	}
}

class I extends H {
	I(){
		super(10);
		System.out.println("Inside default constructor I");
	}
}
