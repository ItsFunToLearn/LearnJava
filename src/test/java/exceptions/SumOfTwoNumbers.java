package exceptions;

public class SumOfTwoNumbers {
	int a, b;
	
	SumOfTwoNumbers(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int add(){
		return a+b;		
	}
	
	public double divide() throws Exception{
		if(b!=0){
			return a/b;
		}else{
			throw new Exception("b value cannot be zero");
		}
		
	}

}
