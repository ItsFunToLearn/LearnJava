package basics;

public class BasicPrograms {

	// Sum of two numbers
	public int method1(int num1, int num2) {
		return num1 + num2;
	}

	// Check if a number is even/odd
	public boolean method2(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Find biggest number
	public String method3(int num1, int num2) {
		String res = null;
		if (num1 > num2) {
			res = "Biggest number is " + num1;
		} else if (num1 < num2) {
			res = "Biggest number is " + num2;
		} else if (num1 == num2) {
			res = "both numbers " + num1 + " and " + num2 + " are equal";
		}
		return res;
	}

	// Check if person age is between 18 and 70
	public boolean method4(int age) {
		String res = null;
		if (age >= 18 && age <= 70) {
			return true;
		} else {
			return false;
		}
	}

	// Depending on day number print day name
	public String method5(int dayNumber) {
		String dayName = null;
		switch (dayNumber) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		}
		return dayName;
	}

	// Depending on month number print season name
	public String method6(int monthNumber) {
		String seasonName = null;
		switch (monthNumber) {
		case 1:
		case 2:
		case 12:
			seasonName = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			seasonName = "Summer";
			break;
		case 6:
		case 7:
		case 8:
			seasonName = "Autumn";
			break;
		case 9:
		case 10:
		case 11:
			seasonName = "Spring";
			break;
		default:
			seasonName = "Invalid season number";
			break;
		}
		return seasonName;
	}

	// Example to show how for loop works
	public void method7() {
		int i;
		for (i = 1; i <= 3; i++) {
			System.out.println("EXECUTING FOR LOOP");
		}

		System.out.println("value of i outside the loop --> " + i);
	}

	// Write a program to print 10 to 1
	public void method8() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	// Display sum of 1 to 10 numbers
	public int method9() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// Find factorial of a number
	public int method10(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	// Display multiplication table of a given number
	public void method11(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	// Generate fibonacci series
	public void method12(int num) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i < num; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

	// Check if a number is prime
	public boolean method13(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	// Print all the prime numbers b/w 3 and 100
	public void method14() {

		for (int i = 3; i <= 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i);
			}

		}
	}

	// For Loop - Variation1
	public void method15() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	// For Loop - Variation2
	public void method16() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
				if (j == 3)
					break;
			}
			System.out.println();
		}
	}

	// For Loop - Variation3
	public void method17() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
				if (i == 3)
					break;
			}
			System.out.println();
		}
	}

	// For Loop - Variation4
	public void method18() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			if (i == 3)
				break;
			System.out.println();
		}
	}

	// For Loop - Variation5
	public void method19() {
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				break;
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
	}

	// For Loop - pattern1
	public void method20() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}

	// For Loop - pattern2
	public void method21() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
	
	// For Loop - pattern3
	public void method22() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
	// For Loop - pattern4
	public void method23() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if((i+j)%2 == 0){
					System.out.print("*");
				}else{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
	
	// For Loop - pattern5
	public void method24() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if((i==1)||(i==5)||(j==1)||(j==5)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	// For Loop - pattern6
	public void method25() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 21; j++) {
				if((i==1)||(i==5)||(j==1)||(j==21)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	// For Loop - pattern7
	public void method26() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if((i+j == 6)||(i==j)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	// For Loop - pattern8
	public void method27() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if((i+j)>=6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	// Display sum of all digits in a given number
	public void method28(int num) {
		int sum=0;
		while(num>0){
			sum = sum + (num % 10);
			num = num / 10;
		}
		
		System.out.println("Sum is " + sum);
	}
	
	// Swap two numbers
	public void method29(int a, int b) {
		System.out.println("a -->" + a);
		System.out.println("b -->" + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping");
		System.out.println("a -->" + a);
		System.out.println("b -->" + b);
	}
	
	//Print ASCII value of a character - using type casting
	public void method30(char c){
		System.out.println("Entered character is " + c);
		System.out.println("ASCII value is " + ((int)c) );
	}
	

}
