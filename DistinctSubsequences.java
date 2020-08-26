public class Solution {
    public int numDistinct(String A, String B) {
       Integer[][] cache = new Integer[A.length()][B.length()];
int ans = getDistinctSubsequence(A,B, 0, 0, "", cache);
return ans;
}

public Integer getDistinctSubsequence(String a, String b, int i, int j, String s, Integer[][] cache){

	if(j==b.length())
		return 1;
	if(i==a.length())
		return 0;
	//System.out.println(i+" "+j);
	
	if(cache[i][j]!=null){
		return cache[i][j];
	}


	if(a.charAt(i)==b.charAt(j)){
		s+=a.charAt(i);
		int x = getDistinctSubsequence(a, b, i+1, j+1, s, cache);
		s = s.substring(0,s.length()-1);
		int y = getDistinctSubsequence(a, b, i+1, j, s, cache);
		cache[i][j]=  x+y;
	}
	else{
		cache[i][j] = getDistinctSubsequence(a, b, i+1, j, s, cache);
	}
	return cache[i][j];

}
}
