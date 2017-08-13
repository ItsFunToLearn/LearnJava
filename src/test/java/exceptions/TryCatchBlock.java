package exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {
		//method1(); //Exception is not handled, hence sop statement will not be executed
		//method2(); //Exception is handled here 
		//method3(); //Single try and multiple catch blocks
		//method5(); //Two try blocks
		//method6(); //Nested try catch Block
		method7(); //Exception in inner catch block
	}
	
	public static void method1(){
		int b = 9/0;
		System.out.println("Inside method1");
	}
	
	public static void method2(){
		try {
			int b = 9/0;
			System.out.println("Inside method2");
		} catch (Exception e) {
			System.out.println("Inside catch block - method2");
		}		
		System.out.println("Rest of the code");
	}
	
	public static void method3(){
		try{
			int a[] = new int[5];
			//a[5] = 3/0;
			//a[5] = 3/1;
			Class.forName("jdhjdf");
			System.out.println("Inside method 3");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside catch bock - ArrayIndexOutOfBoundsException ");
		}catch(ArithmeticException e){
			System.out.println("Inside catch block - ArithmeticException");
		}catch(Exception e){
			System.out.println("Inside catch block -  Exception");
		}		
		System.out.println("Rest of the code");
	}
	
	//Exception is the parent class, hence if we write other exceptions after parent class it becomes unreachable code
	/*public static void method4(){
		try{
			int a=9/0;
		}catch(Exception e){
			
		}catch(ArithmeticException e){ 
			//We will get error "Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception"
		}
	}*/

	//If Exception is in inner try block, control will always go into inner catch block.
	//If inner catch block throws exception then control will go to outer catch block depending on the type of exception
	public static void method5(){
		try{
			try{
				int a[] = new int[5];
				a[5] = 3/0;
				//a[5] = 3/1;
				//Class.forName("jdhjdf");
			}catch(Exception e){
				System.out.println("Inside inner catch block");
				throw new ArrayIndexOutOfBoundsException();
				//throw new ClassCastException();
			}
		}catch(ArithmeticException e){
			System.out.println("Inside outer catch block - ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside outer catch block - ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("rest of the code");
	}
	
	public static void method6(){
		try{
			try{
				int b = 3/0;
			}catch(ArithmeticException e){
				System.out.println("Inside inner catch block 1 - ArithmeticException");
			}
			
			try{
				int a[] = new int[5];
				a[5] = 10;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inside inner catch block 2 - ArrayIndexOutOfBoundsException");
			}
		}catch(Exception e){
			System.out.println("Outer catch block - exception handled");
		}
		
		System.out.println("Rest of the code");
	}
	
	public static void method7(){
		try{
			try{
				int b = 3/0;
			}catch(ArithmeticException e){
				System.out.println("Inside inner catch block 1 - ArithmeticException");
				throw new ClassCastException();
			}
			
			try{
				int a[] = new int[5];
				a[5] = 10;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Inside inner catch block 2 - ArrayIndexOutOfBoundsException");
			}
		}catch(Exception e){
			System.out.println("Outer catch block - exception handled");
		}
		
		System.out.println("Rest of the code");
	}
}
