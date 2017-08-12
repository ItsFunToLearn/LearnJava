package exceptions;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TypesOfExceptions {
	static String s;

	public static void main(String[] args) throws Exception{
		//arithemeticException();			//present in java.lang
		//nullPointerException();			//present in java.lang
		//OutOfMemoryError();				//present in java.lang
		//numberFormatException();  		//present in java.lang
		//fileNotFoundException();   		//present in java.io [java.io.FileNotFoundException]
		//classNotFoundException();  		//present in java.lang
		//illegalArgumentException(6.7);
		//arrayIndexOutOfBoundException();   //present in java.lang
		//classCastException();
		//inputOutputException();
		illigalStateException();    		//present in java.lang
	}

	public static void arithemeticException(){
		int i = 2/0;
	}
	
	public static void nullPointerException(){
		System.out.println(s.concat("Test"));
	}
	
	public static void OutOfMemoryError(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			list.add(10);
		}
	}
	
	public static void numberFormatException(){
		String s1 = "Test";
		int i = Integer.parseInt(s1);
	}
	
	public static void fileNotFoundException() throws Exception{
			FileReader reader = new FileReader("F:\\test.xlsx");		
	}
	
	public static void classNotFoundException() throws ClassNotFoundException{
		Class.forName("Test124");
	}
	
	public static void illegalArgumentException(int b){ //while calling this method supply string argument
		int a = b+b;
		System.out.println(a);
	}
	
	public static void arrayIndexOutOfBoundException(){
		int[] array = new int[5];
		System.out.println(array[5]);
	}
	
	public static void outOfMemoryException() { // error
		long data[] = new long[1000000000];
	}

	public static void classCastException() {
		Test1 obj = new Test1();
		//System.out.println((TypesOfExceptions) obj); //cannot cast parent object to chiled object
	}
	
	public static void inputOutputException() {
		InputStreamReader obj = new InputStreamReader(null);
	}
	
	public static void illigalStateException() {
		String s = "Hello World";
		Scanner scanner = new Scanner(s);
		System.out.println("" + scanner.nextLine());
		scanner.close();
		System.out.println("" + scanner.nextLine());
	}



	
	
}
