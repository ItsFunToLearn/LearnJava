package oops;

class Account{
	int accNo;
	int bal;
	static String bankName = "icici";
	
	void getBal(){
		System.out.println("Your current balance is " + bal);
	}
	
	void withdraw(int amt){
		if(bal>amt){
			bal = bal-amt;
			System.out.println("Amount is debited. Your current bal is " + bal);
		}else{
			System.out.println("Insufficient balance. Your current balance is " + bal);
		}	
	}
}

public class NonStaticExample {
	
	
	public static void main(String[] args) {
		Account actObj = new Account();
		actObj.accNo = 1234;
		actObj.bal = 20000;
		
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n1;
		
		do{
			System.out.println("Enter 1 to check balance. Enter 2 to withdraw");
			n1 = scn.nextInt();
			
			if(n1 == 1){
				actObj.getBal();
			}else if(n1 == 2){
				System.out.println("Enter amount to withdraw");
				int amt = scn.nextInt();
				actObj.withdraw(amt);				
			}else{
				System.out.println("Invalid option");
			}
			
			System.out.println("You want to continue? Enter 1 to continue. Enter 0 to stop ");
			n1 = scn.nextInt();
		}while(n1 == 1);
		
}
}
