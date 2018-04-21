// Selection sort
public class SelectionSort {

	public static int[] SelectionSort(int[] arrayInput) {
		int[] inputArray = arrayInput;
		int tempValue = arrayInput[0];
		int tempIndex = 0;
		
		// Traverse the array by comparing one element with the rest
		for(int i =0; i <inputArray.length; i++) {
			for( int j =i+1; j<inputArray.length; j++) {
				if(arrayInput[i] > arrayInput[j]) {
					System.out.println(arrayInput[i]+" > > > "+arrayInput[j]);
					tempValue = arrayInput[j];
					tempIndex = j;
				}
				// Swap the elements if the  low index elements are largers than high index elements
				swap(i, tempIndex, inputArray);
			}
		}
		
		return inputArray;
	}
	// Swapping two elements
	private static int[] swap(int i, int tempIndex, int[] inputArray) {
		int tempValue = inputArray[i];
		inputArray[i] = inputArray[tempIndex];
		inputArray[tempIndex] = tempValue;
		
		return inputArray;
		
	}
	public static void main(String[] args) {
		
		int[] inputOne =  { 10,9,8,7,6,5,4,3,2,1};
		int[] inputTwo = {1,2,3,4,5,6,7,8,9,10};
		
		inputOne = SelectionSort(inputOne);
		
		for (int i = 0; i < inputOne.length; i++) {
			System.out.println(inputOne[i]);
		}
	}

}
