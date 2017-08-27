package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClassForBasicPgms {
	
	BasicPrograms basicObj = new BasicPrograms();
	
	//@Test(priority = 1)
	public void verifySum(){
		int sum  = basicObj.method1(2, 3);
		System.out.println("Sum is " + sum);
	}
	
	//@Test(priority = 2)
	public void verifyIfEven(){
		Assert.assertTrue(basicObj.method2(56), "Number is not even number");		
	}
	
	//@Test(priority = 3)
	public void biggestOfTwoNumbers(){
		String res  = basicObj.method3(22, 79);
		System.out.println(res);
	}
	
	//@Test(priority = 4)
	public void verifyVoterEligibility(){
		Assert.assertTrue(basicObj.method4(23), "You are ineligible to vote");
	}
	
	//@Test(priority = 5)
	public void verifyDayName(){
		System.out.println("Day name is " + basicObj.method5(7));
	}
	
	//@Test(priority = 6)
	public void verifySeasonName(){
		System.out.println("Season name is " + basicObj.method6(7));
	}
	
	//@Test(priority = 7)
	public void verifyForLoop(){
		basicObj.method7();
	}
	
	//@Test(priority = 8)
	public void print10To1(){
		basicObj.method8();
	}

	//@Test(priority = 9)
	public void printSumOf10Num(){
		System.out.println("Sum of 1 to 10 numbers is " + basicObj.method9());
	}
	
	//@Test(priority = 10)
	public void findFactorial(){
		int num =3;
		System.out.println("Factorial of " + num + " is " + basicObj.method10(num));
	}
	
	//@Test(priority = 11)
	public void displayMultiplicationTable(){
		int num =9;
		System.out.println("MULTIPLICATION TABLE " );
		basicObj.method11(num);
	}
	
	//@Test(priority = 12)
	public void fibonacciSeries(){
		int num =12;
		System.out.println("FIBONACCI SERIES " );
		basicObj.method12(num);
	}
	
	//@Test(priority = 13)
	public void verifyPrimeNumber(){
		int num =11;
		Assert.assertTrue(basicObj.method13(num), "Given number is not a prime number");
	}
	
	//@Test(priority = 14)
	public void printPrimeNumber(){
		basicObj.method14();
	}
	
	//@Test(priority = 15)
	public void forLoopVariation1(){
		basicObj.method15();
	}
	
	//@Test(priority = 16)
	public void forLoopVariation2(){
		basicObj.method16();
	}
	
	//@Test(priority = 17)
	public void forLoopVariation3(){
		basicObj.method17();
	}
	
	//@Test(priority = 18)
	public void forLoopVariation4(){
		basicObj.method18();
	}
	
	//@Test(priority = 19)
	public void forLoopVariation5(){
		basicObj.method19();
	}
	
	//@Test(priority = 20)
	public void pattern1(){
		basicObj.method20();
	}
	
	//@Test(priority = 21)
	public void pattern2(){
		basicObj.method21();
	}
	
	
	//@Test(priority = 22)
	public void pattern3(){
		basicObj.method22();
	}
	
	
	//@Test(priority = 23)
	public void pattern4(){
		basicObj.method23();
	}
	
	//@Test(priority = 24)
	public void pattern5(){
		basicObj.method24();
	}
	
	//@Test(priority = 25)
	public void pattern6(){
		basicObj.method25();
	}
	
	//@Test(priority = 26)
	public void pattern7(){
		basicObj.method26();
	}
	
	//@Test(priority = 27)
	public void pattern8(){
		basicObj.method27();
	}
	
	//@Test(priority = 28)
	public void pattern9(){
		basicObj.method28(312);
	}
	
	//@Test(priority = 29)
	public void pattern10(){
		basicObj.method29(12, 78);
	}
	
	@Test(priority = 30)
	public void convertToAscii(){
		basicObj.method30('Z');
	}
	
	
	
}
