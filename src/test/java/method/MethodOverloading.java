package method;

public class MethodOverloading {
	//When overloaded method is called, java executes based on parameter given
	public static void main(String[] args) {
		add(3, 4);
		add(2.5, 7.9);
	}

	public static void add(int a, int b) {
		System.out.println("Inside add(int value)");
		System.out.println((a+b));
	}

	public static void add(double d1, double d2) {
		System.out.println("Inside add(double value)");
		System.out.println((d1+d2));
	}

	
}
