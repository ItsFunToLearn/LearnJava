package exceptions;

public class CheckAccountBal {
	private int bal;
	
	public CheckAccountBal(int bal){
		this.bal = bal;
	}
	
	public int getBal(){
		return bal;
	}
	
	public void withdrawAmount(int amt) throws Exception{
		if(bal > amt){
			bal = bal-amt;
			System.out.println("Amount debited. Your current balance is " + bal);
		}else{
			String msg = "Error! - Insufficient Balance. Your current balance is ";
			throw new Exception(msg + bal);
		}
	}
}
