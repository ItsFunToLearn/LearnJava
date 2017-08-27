package method;

public class StaticNonStatic {

	static int i=10;
	int j=20;
	
	public static void main(String[] args) {
		test1();
		//test2();
	}
	
	public static void test1(){
		System.out.println(i);
		//System.out.println(j);
	}
	
	public void test2(){
		System.out.println(i);
		System.out.println(j);
	}

}
