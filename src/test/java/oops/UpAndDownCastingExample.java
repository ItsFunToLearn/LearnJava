package oops;

class L{
	void test1(){
		System.out.println("Inside test1 - L");
	}
	
	void test2(){
		System.out.println("Inside test2 - L");
	}
}

class M extends L{
	void test1(){
		System.out.println("Inside test1 - M");
	}
	
	void test3(){
		System.out.println("Inside test3 - M");
	}
}

class N extends L{
	void test1(){
		System.out.println("Inside test1 - N");
	}
	
	void test4(){
		System.out.println("Inside test4 - N");
	}
}

public class UpAndDownCastingExample {

	public static void main(String[] args) {
		L l = new L(); // You can access only the methods inside L class
		l.test1();
		l.test2();
		
		System.out.println("UP CASTING");
		//When we call a over ridden method, method implementation depends on instance type.[Not based on reference type]
		L m = new M(); //Up casting - storing subclass instance in super class variable. You can call overridden method from subclass and other methods from super class
		m.test1(); // can access super class methods
		m.test2(); //can access overidden method of super class
		//m.test3(); // Cannot access subclass methods
		
		System.out.println("DOWN CASTING");
		//If i want to access test3() from M class, i will down cast
		M m1 = (M)m;
		m1.test1();
		m1.test2();
		m1.test3();
		
		System.out.println("USING instanceOf  KEYWORD");
		
		System.out.println(l instanceof L);
	}

}
