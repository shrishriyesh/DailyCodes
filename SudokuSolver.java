public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> a)
    {
        help(a);
    }
	public boolean help(ArrayList<ArrayList<Character>> a) {
	    int r;
	    int c;
	    for(r=0;r<9;r++)
	    {
	        for(c=0;c<9;c++)
	        {
	    if(a.get(r).get(c)=='.')
	    {
	    for(int num=1;num<=9;num++)
	    {
	        if(check(a,r,c,(char)(num+'0')))
	        {
	        a.get(r).set(c,(char)(num+'0'));
	        if(help(a)==true)
	        return true;
	        else
	        a.get(r).set(c,'.');
	    }
	    }
	    return false;
	    }
	        }
	    }
	    return true;
	}
	public boolean check(ArrayList<ArrayList<Character>> a, int row, int col, char c){
    int regionRow = 3 * (row/3);
    int regionCol = 3 * (col/3);
    
    for (int i = 0; i < 9; i++) {
        if (a.get(i).get(col) == c) return false; 
        if (a.get(row).get(i) == c) return false; 
        if (a.get(regionRow + i/3).get(regionCol + i%3) == c) return false; 
    }
    return true;        
    
}
	
}
