package oops;

public class CallToSuper {

	public static void main(String[] args) {
		PhoneCamera obj = new PhoneCamera(2,3,4,5);
		obj.print();
	}

}

class Phone{
	int width;
	int height;
	int length;
	
	Phone(int width, int height, int length){
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	void print(){
		System.out.println("[" + length + " "+ width + " " + height + "]");
	}
	
}

class PhoneCamera extends Phone{
	
	int pixels;
	PhoneCamera(int width, int height, int length, int pixels){
		super(width, height, length);
		this.pixels = pixels;
	}
	
	void print(){
		super.print();
		System.out.println("Pixels " + pixels);
	}
}
