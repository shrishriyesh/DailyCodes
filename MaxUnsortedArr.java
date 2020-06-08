//Easy Soln- O(Nlog(N))
public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int st=0;
        int en=0;
        int arr[]=new int[A.size()];
        boolean flag=true;
        for(int i=0;i<A.size();i++)
        {
            arr[i]=A.get(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<A.size();i++)
        {
            if(arr[i]!=A.get(i))
            {
                st=i;
                flag=false;
                break;
            }
            
        }
        for(int i=A.size()-1;i>=0;i--)
        {
            if(arr[i]!=A.get(i))
            {
                en=i;
                break;
            }
        }
        
        ArrayList<Integer> out=new ArrayList<>();
        if(flag==false)
        {
        out.add(st);
        out.add(en);
        }
        else
        out.add(-1);
        return out;
    }
}

//O(n) soln
int max  = -1;
    int start =Integer.MAX_VALUE;
    int end =-1;
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i = 0; i<A.size(); ++i)
    {
        if(A.get(i)>=max)
        {
            max = A.get(i);
        }
        else
        {
            //the rightmost wrong element which we have gor so far
            end = i;
            //store the min element which is to not in the right place and
            //needs to be replaced.
            start = Math.min(start, A.get(i));
        }
        
    }
    
    //if we did not fing any wrong placed element
    if(end == -1) ans.add(-1);
    else
    {//just look for the place where we can put our lowest wrong placed element,
    //and thus that would be the left index for sorting

        int j =0;
        while(A.get(j)<=start){
            ++j;
        }
        // add the j(the left most element tat we just computed)
        // the end was the right most wrong placed element that we already calculated.
        ans.add(j);
        ans.add(end);
    }
    return ans;
