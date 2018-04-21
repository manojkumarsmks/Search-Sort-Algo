//Binary Search
public class BinarySearch {

	public static void main(String[] args) {
		int [] inputArray = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println(BinarySearchInteratively(inputArray, 90));
	}

	private static int BinarySearchInteratively(int[] inputArray, int element) {
		
		int startIndex = 0;
		int endIndex = inputArray.length;
		
		while(startIndex <= endIndex) {
			int middleIndex = startIndex + (endIndex - startIndex) / 2;
			if(inputArray[middleIndex] == element)
				return middleIndex;
			else if(inputArray[middleIndex] > element)
				endIndex = middleIndex;
			else if(inputArray[middleIndex] < element)
				startIndex = middleIndex;
		}
		return -1;
		
		
	}

}
