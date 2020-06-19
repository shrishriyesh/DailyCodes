public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) 
    {   if(a.size()<=1)
        return 0;
        int l=0;
        int h=a.size()-1;
        int pos=0;
        if(b>a.get(h))
        return h+1;
        while(h>=l)
        {
          int mid=(h+l)/2;
          if(a.get(mid)==b)
              return mid;
          else if(a.get(mid)>b)
              h=mid-1;
          else
              l=mid+1;
        }
        return h+1;
    }
}
