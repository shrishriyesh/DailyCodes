public class Solution {
    public int isInterleave(String A, String B, String C) {
        return recurse(0, 0, 0, A, B, C) ? 1 : 0;
    }

    private boolean recurse(int aIndex, int bIndex, int cIndex, String A, String B, String C) {
        
        //
        if (aIndex == A.length() && bIndex == B.length() && cIndex == C.length()) {
            return true;
        }

        if (cIndex == C.length()) {
            return false;
        }

        boolean answer = false;

        if (aIndex < A.length() && (A.charAt(aIndex) == C.charAt(cIndex))) {
            answer |= recurse(aIndex + 1, bIndex, cIndex + 1, A, B, C);
        }

        if (bIndex < B.length() && (B.charAt(bIndex) == C.charAt(cIndex))) {
            answer |= recurse(aIndex, bIndex + 1, cIndex + 1, A, B, C);
        }

        return answer;
    }
}
