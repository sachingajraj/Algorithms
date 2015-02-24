public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[] arr = {5,2,1,3,4};
		SortQuestions s = new SortQuestions(arr);
		s.quicksort();
		s.printArray();
		*/
		
		/*
		StringQuestions sq = new StringQuestions();
		sq.printAllStringPermutations(new StringBuffer("aba"), 0);
		*/
		
		/*
		ArrayQuestions aq = new ArrayQuestions();
		int[] arr = {2,1,0,0,2,1,0,1,1};
		int[] res = aq.sort012(arr);
		for (int i :res){
			System.out.print(i + " ");
		}
		*/
		
		/*
		StringQuestions sq = new StringQuestions();
		sq.longestPalindrome("abaaba");
		*/
		
		/*
		int[] arr1 = {3,5,10};
		int[] arr2 = {1,3,6,9};
		ArrayQuestions aq = new ArrayQuestions();
		//aq.printArray(aq.merge(arr1, arr2));
		System.out.println(aq.count(arr1, 3, 20));
		*/
		
		LinkedList ll = new LinkedList(2);
		ll.insert(3);
		ll.insert(20);
		ll.insert(12);
		ll.printList();
		
		
		LinkedListQuestion lq = new LinkedListQuestion();
		lq.reverseLinkedListLoop(ll);
	
	}

}
