public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int st[]=new int[A.size()];
        int en[]=new int[A.size()];
        for(int i=0;i<st.length;i++)
        {
            st[i]=A.get(i).get(0);
            en[i]=A.get(i).get(1);
        }
        Arrays.sort(st);
        Arrays.sort(en);
        int curr=1;
        int min=1;
        int i=1;
        int j=0;
        while(i<st.length&&j<st.length)
        {
         if(st[i]<en[j])
         {curr++;
         min=Math.max(curr,min);
         i++;
        }
        else
        {
            j++;
            curr--;
        }
    }
    return min;
    }
}
