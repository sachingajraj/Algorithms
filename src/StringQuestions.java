import java.util.HashMap;

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
		for (curr_idx = 0; curr_idx < str.length; curr_idx++) {
			int i = 0;
			for (i = 0; i < res_idx; i++) {
				if (str[i] == str[curr_idx])
					break;
			}
			if (i == res_idx) {
				str[res_idx] = str[curr_idx];
				res_idx++;
			}
		}
		char[] newStr = new char[res_idx];
		for (int i = 0; i < res_idx; i++) {
			newStr[i] = str[i];
		}
		return newStr;
	}

	// print all permutations of string

	public void printAllStringPermutations(StringBuffer str, int n) {
		if (n == str.length())
			System.out.println(str.toString());

		for (int i = n; i < str.length(); i++) {
			// swap
			char temp = str.charAt(n);
			str.setCharAt(n, str.charAt(i));
			str.setCharAt(i, temp);

			// permute
			printAllStringPermutations(str, n + 1);

			// backtrack
			temp = str.charAt(n);
			str.setCharAt(n, str.charAt(i));
			str.setCharAt(i, temp);
		}
	}

	// Compress string aasasatb --> 2a2sa1t1b

	public void compressString(String str) {
		StringBuffer strBuff = new StringBuffer();
		int count;
		for (int i = 0; i < str.length(); i++) {
			strBuff.append(str.charAt(i));
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			strBuff.append(count);
		}
		System.out.println(strBuff.toString());
	}

	// All distinct palindromic sub-strings

	public void longestPalindrome(String str) {
		char[] arr = str.toCharArray();
		int max_length = 1;
		int start = 0;
		int low, high;
		for (int i = 1; i < str.length(); i++) {
			low = i - 1;
			high = i;
			// even palindrome
			while (low >= 0 && high < str.length() && arr[low] == arr[high]) {
				if (high - low + 1 > max_length) {
					start = low;
					max_length = high - low + 1;
				}
				--low;
				++high;
			}

			low = i - 1;
			high = i + 1;

			// odd palindrome
			while (low >= 0 && high < str.length() && arr[low] == arr[high]) {
				if (high - low + 1 > max_length) {
					start = low;
					max_length = high - low + 1;
				}
				--low;
				++high;
			}
		}

		System.out.println(str.substring(start, start + max_length));
	}

}
