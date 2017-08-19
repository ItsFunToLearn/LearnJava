package collections;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationsInJava {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();  
		vector.add(40);
		vector.add(30);
		vector.add(90);
		vector.add(30);
		vector.add(65);
		
		Enumeration<Integer> obj = vector.elements();
		
		while(obj.hasMoreElements()){
			System.out.println(obj.nextElement());
		}
	}
}
