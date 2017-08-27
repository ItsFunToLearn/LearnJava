package oops;

public class StaticLocalGlobalVar {
	public static void main(String[] args) {
		A.display();
	}
}

class A{
	static int i=10;	
	static void display(){
		int i=20;
		System.out.println("Local variable --> "+i);
		System.out.println("Global variable --> " + A.i);
	}
}
