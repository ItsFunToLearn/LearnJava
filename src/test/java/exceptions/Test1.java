package exceptions;

public class Test1 {
	public static void main(String[] args) {
		String str = "this is a test string";
		String reverse ="";
		
		for(int i=str.length()-1; i>=0 ; i--){
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
		

	}

}
