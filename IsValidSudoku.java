public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        HashSet<String> seen = new HashSet();
        int len = A.length;
        
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                char ch = A[i].charAt(j);
                if(ch!='.') {
                if( !seen.add(ch + "found in row" + i) ||
                !seen.add(ch + "found in col" + j) ||
                !seen.add(ch + "found in box" + i/3 + "-" + j/3) ) 
                return 0;
                }
            }
        }
        
        return 1;
    }
}
