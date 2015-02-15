public class StringQuestions {
	
	// Reverse a string 
	public String reverseString(String str) {

		if (str.length() < 2)
			return str;

		StringBuffer revStr = new StringBuffer(str);
		int startIdx = 0, endIdx = revStr.length() - 1;
		char temp;

		while (startIdx < endIdx) {
			temp = revStr.charAt(startIdx);
			revStr.setCharAt(startIdx, revStr.charAt(endIdx));
			revStr.setCharAt(endIdx, temp);
			startIdx++;
			endIdx--;
		}

		return revStr.toString();
	}
	
	// Remove duplicate char
	public static char[] removeDuplicate(char[] str) {
		int curr_idx = 0;
		int res_idx = 0;
		for (curr_idx = 0; curr_idx < str.length ; curr_idx++ ) {
			int i = 0;
			for (i = 0; i < res_idx; i++) {
				if (str[i] == str[curr_idx]) break;
			}
			if (i == res_idx) {
				str[res_idx] = str[curr_idx];
				res_idx++;
			}
		}
		char[] newStr = new char[res_idx];
		for (int i = 0; i < res_idx; i++){
			newStr[i] = str[i];
		}
		return newStr;
	}
	
	// print all permutations of string
	
	public void printAllStringPermutations(StringBuffer str, int n){
		if (n == str.length())
			System.out.println(str.toString());
		
		for(int i = n; i < str.length(); i++){
			//swap
			char temp = str.charAt(n);
			str.setCharAt(n, str.charAt(i));
			str.setCharAt(i, temp);
			
			//permute
			printAllStringPermutations(str, n + 1);
			
			//backtrack
			temp = str.charAt(n);
			str.setCharAt(n, str.charAt(i));
			str.setCharAt(i, temp);
		}
	}
	
	

}
