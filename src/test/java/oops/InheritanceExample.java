package oops;

public class InheritanceExample {
	public static void main(String[] args) {
		F obj = new F();
		obj.display();
		obj.test1();
		obj.test1(10);
	}
	
}

class E{
	int i=10;
	
	void test1(){
		System.out.println("test1 in A");
	}
}

class F extends E{
	 int j = 20;
	 
	 void test1(int i){						   //--> Overloading in sub class
			System.out.println("test1 in E");
		}
	 
	 void display(){
		 System.out.println(i);
		 System.out.println(j);
	 }
}
