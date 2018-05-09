import javax.print.DocFlavor.INPUT_STREAM;

// Bubble sort - Swapping algorithm
public class BubbleSort {
	int[] inputArray;
	
	// Constructor for inputArray
	public BubbleSort (int[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void BubbleSortAlgo() {
		// Swap for every element at i > every element at j 
		for(int i =0; i<inputArray.length-1; i++) {
			for(int j = i+1; j<inputArray.length;j++) {
				if(inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] inputArray = {9,8,7,6,5,4,3,2,1};
		BubbleSort bubbleSort = new BubbleSort(inputArray);
		bubbleSort.BubbleSortAlgo();
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

	}

}
