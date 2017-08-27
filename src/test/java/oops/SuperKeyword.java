package oops;

public class SuperKeyword {
	public static void main(String[] args) {
		K obj = new K();
		obj.display();
		obj.test2();
	}
}

class J {
	int i = 10;
	
	void test1(){
		System.out.println("test1 inside J");
	}
}

class K extends J {
	int i = 20;
	
	void test1(){
		System.out.println("test1 inside K");
	}
	
	void test2(){
		test1();
		super.test1();
	}

	void display() {
		System.out.println(i);
		System.out.println(super.i);
	}
}
