public class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashMap<Character,Integer> m=new HashMap<>();
        int max=Integer.MIN_VALUE;int c=0;
        int arr[]=new int[26];
        for(int i=0;i<A.length();i++)
        {  
            if(!m.containsKey(A.charAt(i)))
            {
                m.put(A.charAt(i),i);
                c++;
                if(c>max)
                max=c;
            }
            else
            {   i=m.get(A.charAt(i));
               m.clear();
               c=0;
            }
        }
        return max;
    }
}
