package recursionProblems;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String str = "appnnacollege";
		removeDuplicates(str,0,new StringBuilder (""),new boolean[26] );

	}
	
	public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[] ) {
		//str is input string, idx is starting index StringBuilder is passed to print output beecause string requires more time and memory to process, boolean 
		//type array is passed to store boolean value of char if it is present in input string or not
		
		//base condition
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		char currChar = str.charAt(idx);
		if(map[currChar -'a'] == true) {
			//duplicate
			//Move to next char in input string
			removeDuplicates(str, idx+1, newStr, map);
		}
		else {
			//if it is not a duplicate it is passed to map as true for that index of char
			map[currChar -'a'] =true;
			//char will be appended in newStr
			removeDuplicates(str, idx + 1, newStr.append(currChar), map);
		}
	}

}
