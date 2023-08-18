public class SortingAlgorithms {

	public static void mergeSort(int[] array, int left, int right) {
		if(left < right) {
			int middle = left + (right - left) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}
	
	private static void merge(int[] array, int left, int middle, int right) {
		int array1Length = middle - left + 1, array2Length = right - middle;
		
		int[] array1 = new int[array1Length], array2 = new int[array2Length];
		
		for(int i = 0; i < array1Length; i++) {
			array1[i] = array[left + i];
		}
		
		for(int i = 0; i < array2Length; i++) {
			array2[i] = array[middle + 1 + i];
		}
		
		int i = 0, j = 0, k = left;
		
		while(i < array1Length && j < array2Length) {
			if(array1[i] < array2[j]) {
				array[k] = array1[i];
				i++;
			} else {
				array[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while(i < array1Length) {
			array[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2Length) {
			array[k] = array2[j];
			j++;
			k++;
		}
	}
	

	
	public static void selectionSort(int[] array) {
		int arrayLength = array.length;
		
		for(int i = 0; i < arrayLength - 1; i++) {
			int currentSmallest = i;
			for(int j = i + 1; j < arrayLength; j++) {
				if(array[currentSmallest] > array[j]) {
					currentSmallest = j;
				}
			}
			swap(array, i, currentSmallest);
		}
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void bubbleSort(int[] array) {
		int arrayLength = array.length;
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < arrayLength - 1; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					isSorted = false;
				}
			}
		}
	}
	
	public static void insertionSort(int[] array) {
		int arrayLength = array.length;
		
		for(int i = 1; i < arrayLength; i++) {
			int key = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j -= 1;
			}
			array[j + 1] = key;
		}
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left >= right) return;
		
		int pivot = array[(left + right) / 2];
		int midPoint = partition(array, left, right, pivot);
		
		quickSort(array, left, midPoint - 1);
		quickSort(array, midPoint, right);
	}
	
	private static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			while(array[left] < pivot) {
				left++;
			}
			while(array[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	
	
}
