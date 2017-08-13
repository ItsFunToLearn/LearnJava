package exceptions;

//Throw keyword is used to throw an exception.
//We can throw checked or unchecked exceptions
//AFTER THOWING AN EXCEPTION YOU CANNOT WRITE ANYTHING AS IT BECOMES UNREACHABLE CODE

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		try {
			example1(16);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
		
		try {
			example2();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
		try {
			example3();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		
	}
	
	public static void example1(int age) throws Exception{
		if(age<18){
			throw new Exception("You are minor and ineligible to vote!");
			//System.out.println("*************"); //AFTER THOWING AN EXCEPTION YOU CANNOT WRITE ANYTHING AS IT BECOMES UNREACHABLE CODE
		}else{
			System.out.println("You CAN vote");
		}
	}
	
	public static void example2() throws Exception{
		SumOfTwoNumbers sumObj = new SumOfTwoNumbers(5, 0);
		System.out.println("Sum of two numbers is "+sumObj.add());
		System.out.println(sumObj.divide());
	}
	
	public static void example3() throws Exception{
		CheckAccountBal balObj = new CheckAccountBal(6000);
		System.out.println("Current balance is "+balObj.getBal());
		balObj.withdrawAmount(7000);
	}

}
