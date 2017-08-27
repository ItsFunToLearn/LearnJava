package method;

public class TypeCasting {

	public static void main(String[] args) {
		double d = 10;			//Automatic Widening
		System.out.println(d);
		
		int i = (int)3.5;		//Explicit narrowing
		System.out.println(i);
		
		test1(10);
		//For a method which accepts double value as argument you can pass integer also because of automatic widening

		System.out.println("test2() return value "+test2());
	}
	
	public static void test1(double d){
		System.out.println("value of d " + d);
	}
	
	public static double test2(){
		return 10;  // You can return an integer value too
	}

}
