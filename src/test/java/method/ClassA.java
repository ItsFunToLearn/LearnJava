package method;

public class ClassA {

	public static void main(String[] args) {
		//To refer static members use class name
		System.out.println(StaticNonStatic.i);
		StaticNonStatic.test1();
		
		//To refer non static members use obj name
		StaticNonStatic obj1 = new StaticNonStatic();
		obj1.j = 40;
		System.out.println("obj1 j value " + obj1.j);
		obj1.test2();
		
		StaticNonStatic obj2 = new StaticNonStatic();
		obj2.j = 60;
		System.out.println("obj2 j value "+obj2.j);
		obj2.test2();
		
	}

}
