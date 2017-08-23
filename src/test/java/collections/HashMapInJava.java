package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInJava {
	public static void main(String[] args) {
		method3();
	}
	
	public static void method1(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Test1");
		map.put(12, "Test2");
		map.put(11, "Test3"); //Data is over ridden because of duplicate values
		map.put(12, "Test4");
		
		System.out.println(map);
	}
	
	
	public static void method2(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Test1");
		map.put(12, "Test2");
		map.put(13, "Test3"); 
		map.put(14, "Test4");
		
		Set<Integer> set = map.keySet();
		System.out.println("Set of keys " + set);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println("value " + map.get(itr.next()));
		}
	}
	
	public static void method3(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Test1");
		map.put(12, "Test2");
		map.put(13, "Test3"); 
		map.put(14, "Test4");
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entry.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getValue());
		}
		 
	}
	
	public static void method4(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "Test1");
		map.put(12, "Test2");
		map.put(13, "Test3"); 
		map.put(14, "Test4");
		
		for(Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey() +" " + entry.getValue());
		}
	}
}
