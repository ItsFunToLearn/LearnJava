package interviewPrograms;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CommonElementsInArray {
	
	public static void main(String[] args) {
		CommonElementsInArray obj = new CommonElementsInArray();
		
		int[] arr1 = {8, 9, 7, 1, 9, 8, 9, 6, 3, 9};
		int[] arr2 = {9, 6, 1, 1, 3, 3, 6, 4, 7, 3};
		
		obj.findCommonElementsInArray2(arr1, arr2);
		
	}
	
	public void findCommonElementsInArray1(int[] arr1, int[] arr2){
		int count=0;
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				count++;
				if(arr1[i] == arr2[j]){
					System.out.print(arr1[i] + " , ");
					set.add(arr1[i]);		
				}
			}
		}
		
		System.out.println();
		System.out.println(set);
		System.out.println("COUNT --> " + count);
	}
	
	
	public void findCommonElementsInArray2(int[] arr1, int[] arr2){
		int count = 0;
		List<Integer> list = new LinkedList<Integer>();
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0; i<arr1.length; i++){
			boolean isDistinct = true;
			for(int j=0; j<i; j++){
				count++;
				if(arr1[i] == arr1[j]){
					isDistinct = false;
					break;
				}
			}
			
			if(isDistinct){
				list.add(arr1[i]);
			}
		}
		
		
		System.out.println("Distinct elements in array1 --> " + list);
		
		
		for(int i=0; i<list.size(); i++){
			for(int j=0; j<arr2.length; j++){
				count++;
				if(list.get(i) == arr2[j]){
					set.add(list.get(i));
				}
			}
		}
		
		
		System.out.println("Common elements in both arrays " + set);
		System.out.println("COUNT --> " + count);
		
		
	}

}
