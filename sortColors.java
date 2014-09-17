
public class sortColors {

	//sort array of colors 0-2 where all the 0s are first then 1s
	//then 2s. This is a 2-Step solution.
	public sortColors(){
		
	}
	static void sortColors(int[] A){
		int[] count = new int[3];
		for(int i = 0; i < A.length; i++){
			count[A[i]]++;
		}
		for(int i = 0; i < A.length;i++){
			if(i<count[0]){
				A[i]=0;
			}else if(i <count[0] + count[1]){
				A[i] = 1;
			}else{
				A[i] = 2;
			}
		}
	}
	//sort array of colors 0-2 where all the 0s are first then 1s
	//then 2s. This is a 1-Step solution.
	static void sortColors2(int[] A){
		int p0 = -1; // point to index before p0 they are all less than 1;
		int p2 = A.length;//point to index that after they are all greater than 2
		//i is the 3rd pointer.
		for(int i = 0; i < p2; i++) {
			if(A[i] == 0) {//switch
			  p0++;
			  //exchange A[i] with A[p0]
			  A[i] = A[p0];
			  A[p0] = 0;
			} else if( A[i] == 2){
				p2--;
				A[i] = A[p2];
				A[p2] = 2;
				i--;
			}
		}
	}
}
