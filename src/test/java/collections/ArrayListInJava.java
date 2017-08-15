package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
		//method6();
		//method7();
		//method8();
		//method9();
		//method10();
		method11();

	}
	
	//Example of adding different kind of elements without specifying generic type
	public static void method1(){
		//Since we have not specified generic type we can store any type of data
		//[Warning is displayed because generic type is not specified]
		
		List list = new ArrayList();
		list.add(10);
		list.add(true);
		list.add("rathna");
		list.add(20.45);
		list.add(10); 				//We can insert duplicate elements too
		System.out.println(list); 	//It maintains insertion order
	}
	
	//Specifying generic type
	public static void method2(){
		//Here we have specified generic type as Integer. We cannot use primitive data types.
		
		List<Integer> list = new ArrayList<Integer>();  
		list.add(40);
		list.add(30);
		list.add(90);
		list.add(30);
		list.add(65);
		//list.add(true); 			//Error: The method add(Integer) in the type List<Integer> is not applicable for the arguments (boolean)
		System.out.println(list);
	}
	
	//addAll(Collection)
	public static void method3(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(20);
		list2.add(80);
		list2.add(30);
		list2.add(75);
		System.out.println("list2 "+list2);
		
		//If I want to add the data of one array list to another array list use addAll()
		list1.addAll(list2);
		System.out.println("After adding list2 to list1 ");
		System.out.println("list1 " + list1);
		System.out.println("list2 "+list2);
		
	}
	
	//add(index, element)
	public static void method4(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(40);
		list.add(30);
		list.add(90);
		list.add(30);
		list.add(65);
		System.out.println(list);
		
		//I want to add data at a particular index 
		list.add(2, 11);
		System.out.println(list);
	}
	
	//removeAll()
	public static void method5(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(20);
		list2.add(80);
		list2.add(3);
		list2.add(75);
		System.out.println("list2 "+list2);
		
		//To remove matching data present in a list
		list1.removeAll(list2);
		System.out.println("After removing matching data from list1 present in list2");
		System.out.println("list1 " + list1);
		System.out.println("list2 "+list2);
		
		//To remove data based on index
		list1.remove(1);
		System.out.println("list1 " + list1);		
	}
	
	//We can add different types of elements to list if the generic type is Object
	public static void method6(){
		List<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(true);
		list.add("rathna");
		list.add(20.45);
		list.add(10); 				
		System.out.println(list);
	}
	
	//retainAll() - compares list1, list2 and retains matching elements in list1
	public static void method7(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(20);
		list2.add(80);
		list2.add(3);
		list2.add(75);
		System.out.println("list2 "+list2);
		
		list1.retainAll(list2);
		System.out.println("list1 " + list1);
		System.out.println("list2 "+list2);
	}
	
	//containsAll() - check if list2 elements are present in list1 and returns boolean value
	public static void method8(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(20);
		list2.add(80);
		list2.add(3);
		list2.add(75);
		System.out.println("list2 "+list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list3 " + list3);
		
		boolean result1 = list1.containsAll(list2);
		System.out.println("result1 " + result1);
		
		boolean result2 = list1.containsAll(list3);
		System.out.println("result2 " + result2);
	}
	
	//contains() - used to find if an element is present in list - returns boolean value
	public static void method9(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		boolean result1 = list1.contains(4);
		System.out.println("result1 " + result1);
		
		boolean result2 = list1.contains(10);
		System.out.println("result2 " + result2);		
	}
	
	//get() - to retrieve an element based on index
	public static void method10(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		System.out.println("Element at index 2 "+list1.get(2));		
	}
	
	public static void method11(){
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(8);
		list1.add(3);
		list1.add(9);
		list1.add(4);
		list1.add(6);
		System.out.println("list1 " + list1);
		
		System.out.println("Size of list is " + list1.size());
	}

}
