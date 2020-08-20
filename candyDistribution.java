public class Solution {
    public int candy(ArrayList<Integer> A) {
        int res = A.size(), n = A.size();
        if(n == 0)
            return 0;
        Integer[] distributeArr = new Integer[n];
        Arrays.fill(distributeArr, 1); //filling minimum 1 cholocate for each student
        
        for(int i=1; i<n; i++) {
            if(A.get(i) > A.get(i-1)) { 
                distributeArr[i] = distributeArr[i-1]+1;
            }
        }
    
        for(int i=n-2; i>=0; i--) {
            if(A.get(i) > A.get(i+1)) { //checking with right neighbor
                // give one more candy
                distributeArr[i] = Math.max(distributeArr[i], distributeArr[i+1]+1);
            }
        }
       int sum=0;
       for(int i:distributeArr)
       {
           sum+=i;
       }
       return sum;
    }
}
