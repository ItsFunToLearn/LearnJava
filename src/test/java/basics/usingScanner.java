package basics;

public class usingScanner {

	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		System.out.println("Enter a String");
		String str = scn.next();
		System.out.println("Enter a decimal number");
		double decimalNumber = scn.nextDouble();
		
		System.out.println(num);
		System.out.println(decimalNumber);
		System.out.println(str);

	}

}
