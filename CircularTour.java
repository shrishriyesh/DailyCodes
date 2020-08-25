public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
   int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
    int startIndex = 0;
	int totalRemain = 0;
	int currentRemain = 0;
	
	Integer[] a = A.toArray(new Integer[A.size()]);
	Integer[] b = B.toArray(new Integer[B.size()]);
	
	for(int i = 0; i < a.length; i++) {
		int remain  = a[i] - b[i];
		totalRemain += remain;
		currentRemain += remain;
		if(currentRemain < 0) {
			startIndex = i + 1;
			currentRemain = 0;
		}
	}
	
	return totalRemain < 0 ? -1 : startIndex;
}
}
