package oops;

public class NonStaticLocalGlobalVar {
	public static void main(String[] args) {
		B obj = new B();
		obj.display();
	}
	
}

class B{
	int i;
	void display(){
		int i=20;
		System.out.println("Local variable --> "+i);
		System.out.println("Global variable --> " + this.i);
	}
}
