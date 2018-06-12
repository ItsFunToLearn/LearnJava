package interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharInString {
	public static void main(String[] args) {		
		String str = "AEROPLANE";
		
		DuplicateCharInString obj = new DuplicateCharInString();
		obj.findDuplicateCharInString(str);
	}
	
	public void findDuplicateCharInString(String str){
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++){
			char searchChar = charArray[i];
			if(map.containsKey(searchChar)){
				map.put(searchChar, (map.get(searchChar)+1));
			}else {
				map.put(searchChar, 1);
			}
		}
		
		for(Character ele : map.keySet()){
			if(map.get(ele) >1)
			{
				System.out.println(ele + " ---> " + map.get(ele));
			}
		}
		
		
	}
	
}
