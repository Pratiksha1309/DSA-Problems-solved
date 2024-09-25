package recursionProblems;

public class BinaryStringProblem {

	public static void main(String[] args) {
		printBinaryStrings(3, 0, "");
		
	}
	public static void printBinaryStrings(int n, int lastPlace, String str) {
		//Print all binary strings of size N without consecutive ones.
		
		//n = 0 "_"
		//n = 1 "1", "0"
		//n = 2 "00", "01", "10"
		//n = 3 At first place 0 is fixed. lastPlace is number present before placing the current number. "000" lastPlace  = 0, "001" lastPlace  = 0, 
		//"010" lastPlace = 1, 
		//At first place 1 is fixed. "100" lastPlace = 1, "101" lastPlace = 1
		//Base case n = 0 return empty string
		//nth place will be 0/1
		//for n - 1 places call f(n-1) will be called
		if(n == 0) {
			System.out.println(str);
			return ;
		}
//		if(lastPlace == 0) {
//			printBinaryStrings(n-1, 0, str + "0");
//			printBinaryStrings(n-1, 1, str + "1");
//		}
//		else {
//			printBinaryStrings(n-1, 0, str + "0");
//		}
		printBinaryStrings(n-1, 0, str + "0");
		if(lastPlace == 0) {
			printBinaryStrings(n-1, 1, str + "1");
		}
		
	}
	
}
