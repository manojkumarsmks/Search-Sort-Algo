// Insertion Sort
public class InsertionSort {

	public static void main(String[] args) {
		int[] inputArray = {9,8,7,6,5,4,3,2,1};
		insertionSort(inputArray);
	}

	private static void insertionSort(int[] inputArray) {
		
		for (int i = 1; i < inputArray.length; i++) {
			int temp = inputArray[i];
			int j = i-1;
			
			while(j >= 0 && inputArray[j] > temp) {
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1] = temp;
		}
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
}
