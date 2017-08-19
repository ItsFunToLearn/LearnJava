package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsInJava {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
		}
		
		System.out.println("list1 " + list1);
		
		
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(8);
		list2.add(3);
		list2.add(9);
		list2.add(4);
		list2.add(6);
		System.out.println("list2 " + list2);
		
		ListIterator<Integer> itr2 = list2.listIterator();
		
		System.out.println("*************** hasPrevious() ***********************");
		
		while(itr2.hasPrevious()){
			itr2.hasPrevious();
		}
		System.out.println("list2 " + list2);
		
		System.out.println("*************** hasNext() **********************");
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		System.out.println("list2 " + list2);
		
		System.out.println("*************** hasPrevious() ***********************");
		
		while(itr2.hasPrevious()){
			System.out.println(itr2.previous());
		}
		System.out.println("list2 " + list2);
	}

}
