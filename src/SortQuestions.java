public class SortQuestions {
	private int[] _arr;
	private int[] tempArr;

	public SortQuestions(int[] arr) {
		_arr = arr;
		tempArr = new int[getSize()];
	}

	public int getSize() {
		return _arr.length;
	}

	public int[] mergeSort() {
		mergeSort(0, getSize() - 1);
		return _arr;
	}

	private void mergeSort(int start, int end) {
		if (end <= start)
			return;
		int mid = start + (end - start) / 2;
		mergeSort(start, mid);
		mergeSort(mid + 1, end);
		merge(start, mid, end);
	}

	private void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			tempArr[i] = _arr[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {
			if (tempArr[i] <= tempArr[j]) {
				_arr[k] = tempArr[i];
				i++;
			} else {
				_arr[k] = tempArr[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			_arr[k] = tempArr[i];
			i++;
			k++;
		}

	}

	// quick sort

	private int partition(int low, int high) {
		int x = _arr[high];
		int i = low;

		while (low < high) {
			if (_arr[low] <= x) {
				int temp = _arr[i];
				_arr[i] = _arr[low];
				_arr[low] = temp;
				i++;
			}
			low++;
		}
		_arr[high] = _arr[i];
		_arr[i] = x;
		return i;
	}

	private void quicksort(int low, int high) {
		if (low < high) {
			int p = partition(low, high);
			quicksort(low, p - 1);
			quicksort(p + 1, high);
		}
	}

	public void quicksort() {
		quicksort(0, getSize() - 1);
	}

	// print array

	public void printArray() {
		for (int i = 0; i < getSize(); i++) {
			System.out.print(_arr[i] + " ");
		}
		System.out.println();
	}

}
