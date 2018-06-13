package interviewPrograms;

import java.util.Arrays;

public class Anagram {
// Second string should be a combination of first string characters
	
	public static void main(String[] args) {
		String s1= "abec";
		String s2 = "bca";
		
		Anagram obj = new Anagram();
		boolean result = obj.isAnagram1(s1, s2); //isAnagram3/2 would be appropriate
		System.out.println(result);
	}
	
	
	public boolean isAnagram1(String str1, String str2){
		char[] charArr = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i<charArr.length; i++){
			int index = sb.indexOf("" +charArr[i]);
			if(index != -1){
				sb.deleteCharAt(index);
			}
		}
		
		if(sb.length() ==0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isAnagram2(String str1, String str2){
		boolean isAnagram = true;
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int j=0; j<str2.length(); j++){
				char c1 = str2.charAt(j);
				if(str1.indexOf(c1) == -1){					
					isAnagram = false;
					break;
				}
		}		
		
		if(isAnagram){
			return true;
			}else{
			return false;
		}
	}
	
	public boolean isAnagram3(String str1, String str2){
		//Remove all white space first
		
		String s1 = str1.replace("\\s", "");
		String s2 = str2.replace("\\s", "");
		boolean flag = true;
		
		
		if(s1.length() != s2.length()){
			flag = false;
		}else{
			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			flag = Arrays.equals(s1Array, s2Array);
		}
		
		return flag;
	}
}
