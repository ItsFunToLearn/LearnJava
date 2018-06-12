package interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDisctinctElementInArray {
	
	public static void main(String[] args) {
		PrintDisctinctElementInArray obj = new PrintDisctinctElementInArray();
		
		int[] arr = {8, 9, 7, 1, 9, 8, 9, 6, 3, 9};
		obj.printDistinctElementsInArray2(arr);
	}
	
	public void printDistinctElementsInArray1(int[] arr){
		
		for(int i=0; i<arr.length; i++){
			boolean isDistinct = true;
			for(int j=0; j<i; j++){
				if(arr[i] == arr[j]){
					isDistinct = false;
					break;
				}
			}
			
			if(isDistinct){
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	public void printDistinctElementsInArray2(int[] arr){
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++){
			int searchEle = arr[i];
			if(map.containsKey(searchEle)){
				map.put(searchEle, map.get(searchEle)+1);
			}else{
				map.put(searchEle, 1);
			}
		}
		
		System.out.println(map.keySet());
	}

}
