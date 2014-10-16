public class MergeSort{

	public MergeSort(){}
	
	public int[] Sort(int[] unsortedArray){
		if(unsortedArray == null){
			return null;
		}
		int arrayLength = unsortedArray.length;
		if(unsortedArray.length == 1){
			return unsortedArray;
		}
		int n = (int) Math.floor(arrayLength/2);
		int[] A = new int[n];
		int[] B = new int[arrayLength-n];
		int[] C = new int[arrayLength];
		for(int i = 0; i < arrayLength;i++){
			if(i < n) {
				A[i] = unsortedArray[i];
			} else {
				B[i-n] = unsortedArray[i];
			}
		}
		A = Sort(A);
		B = Sort(B);
		C = Merge(A,B);
		return C;
	}

	public int[] Merge(int[] leftArray,int[] rightArray){
		int[] newArray = new int[leftArray.length + rightArray.length];
		int leftArrayIndex = 0;
		int rightArrayIndex = 0;
		int newArrayIndex = 0;
		while(leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length){
			if(leftArray[leftArrayIndex] < rightArray[rightArrayIndex]){
				newArray[newArrayIndex] = leftArray[leftArrayIndex];
				leftArrayIndex++;
			} else {
				newArray[newArrayIndex] = rightArray[rightArrayIndex];
				rightArrayIndex++;
			}
			newArrayIndex++;
		}
		while(leftArrayIndex < leftArray.length){
			newArray[newArrayIndex] = leftArray[leftArrayIndex];
			leftArrayIndex++;
			newArrayIndex++;
		}
		while(rightArrayIndex < rightArray.length){
			newArray[newArrayIndex] = rightArray[rightArrayIndex];
			rightArrayIndex++;
			newArrayIndex++;
		}
		return newArray;
	}
}