package recursionProblems;

public class PracticeProblems {

	public static void main(String[] args) {
		int[] arr = {3,2,4,5,6,2,7,2,2};
		System.out.println();
        findOccurance(arr,2,0);
        String str = "String";
        System.out.println(lengthOfString(str));
        numToString(1978);

	}
	public static void findOccurance(int[] arr, int key, int i) {
		//For a given integer string of length n. Find all occurences(indices) of key and print them
		//Sample Input: {3,2,4,5,6,2,7,2,2}
		//Sample Output: 1 5 7 8
		
		if(i == arr.length) {
			return; 
		}
		if(arr[i] == key ) {
			System.out.print(i + " ");
		}
		findOccurance(arr, key, i+1);
	}

	public static int lengthOfString(String str) {
		//Find length of a string using recursion
		
		if(str.isEmpty() ) {
			return 0;
		}
		else {
			return 1 + lengthOfString(str.substring(1));
		}
		//1+lengthOfString(tring)
		//1+1+lengthOfString(ring)
		//1+1+1+lengthOfString(ing)
		//1+1+1+1+lengthOfString(ng)
		//1+1+1+1+1+lengthOfString(g)
		//1+1+1+1+1+1=6
	}
	public static void numToString(int num) {
		//You are given a number(eg- 2022) of size n. You have to convert it into a String of english like "two zero two two". Last digit can't be 0
		
		String[] numbers = {"zero", "one", "two","three","four", "five","six", "seven","eight", "nine"};
		
		if(num == 0) {
			return;
		}
		// Recursive call to process the rest of the digits
        numToString(num / 10);

        // Print the current digit in word form if it's not the last zero digit
        int digit = num % 10;

        // To avoid printing the last digit as zero
        if (digit != 0 || (num / 10) != 0) {
            System.out.print(numbers[digit] + " ");
        }
        //1978
        //197
        //19
        //1
        //0 //return
        //1 % 10 = 1 "one"
        //19 % 10 = 9 "nine"
        //197 % 10 = 7 "seven"
        //1978 % 10 = 8 "eight"
	}
}
