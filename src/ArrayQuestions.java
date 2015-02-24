public class ArrayQuestions {
	
	public int[] sort012(int[] arr) {
		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		while (j <= k) {
			if (arr[j] == 0) {
				// swap i and j
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			} else if (arr[j] == 2) {
				// swap j and k
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				k--;
			}
			j++;
		}
		return arr;
	}

	// merge to sorted array

	public int[] merge(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];

		int i = 0, j = 0;
		for (int k = 0; k < res.length; k++) {
			if(i < arr1.length){
				res[k] = (arr1[i] < arr2[j])?arr1[i]:arr2[j];
				i++;
			}else{
				res[k] = arr2[j];
				j++;
			}
		}
		return res;
	}
	
	// Returns the count of ways we can sum  S[0...m-1] coins to get sum n
	public int count( int S[], int m, int n )
	{
	    // If n is 0 then there is 1 solution (do not include any coin)
	    if (n == 0)
	        return 1;
	     
	    // If n is less than 0 then no solution exists
	    if (n < 0)
	        return 0;
	 
	    // If there are no coins and n is greater than 0, then no solution exist
	    if (m <=0 && n >= 1)
	        return 0;
	 
	    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
	    return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
	}
	 
	
	// print array 
	public void printArray(int[] arr){
		for (int i : arr){
			System.out.println(i + " ");
		}
		System.out.println();
	}
}
