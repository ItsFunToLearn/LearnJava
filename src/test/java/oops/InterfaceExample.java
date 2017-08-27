package oops;

interface Switch{
	void on();
	void off();
}

interface Regulator{
	void increase();
	void decrease();
}

class Fan implements Switch, Regulator{
	public void on(){
		System.out.println("Fan is turned on");
	}
	
	public void off(){
		System.out.println("Fan is turned off");
	}
	
	public void increase(){
		System.out.println("Regulator is increased");
	}

	public void decrease(){
		System.out.println("Regulator is decreased");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Fan f = new Fan();
		f.on();
		f.off();
		f.increase();
		f.decrease();
	}

}
