package interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {
	public static void main(String[] args) {
		CompressString obj = new CompressString();
		String str = "aaaabbbccd";
		obj.getCompressedString2(str);
		
	}
	
	public void getCompressedString1(String str){
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++){
			char c = charArr[i];
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		for(Character ele : map.keySet()){
			System.out.print(ele + "" + map.get(ele)); // if we dont add "" it will convert character into ascii value and print a different output
		}
	}
	
	
	
	public void getCompressedString2(String str){
		int count=0;
		char temp = str.charAt(0);
		for(int i=0; i<str.length(); i++){
			 if(str.charAt(i) ==  temp){
				 count++;
			 }else{
				 System.out.print(temp + "" + count);
				 count=1;
				 temp=str.charAt(i);
			 }
		}
		System.out.print(temp + "" + count);
	}
}
