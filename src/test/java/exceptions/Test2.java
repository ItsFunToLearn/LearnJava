package exceptions;

public class Test2 {
	public void method1() throws Exception{
		try{
			System.out.println("inside method1");
			int a = 3/0;
			System.out.println("after execution in method1");
		}catch(Exception e){
			System.out.println("Inside catch block - method1");
			throw new Exception();
		}	
		
		System.out.println("rest of the code - method1");
	}
	
	public void method2() throws Exception{
		try{
			System.out.println("inside method2");
			int[] a = new int[5];
			a[5] = 10;
			System.out.println("after execution in method2");			
		}catch(Exception e){
			System.out.println("Inside catch block - method2");
			throw new Exception();
		}
		
		System.out.println("rest of the code - method2");
	}
}
