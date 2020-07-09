public class Solution {
    public int colorful(int A) {
        ArrayList<Integer> dig=new ArrayList();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=A;
        while(n!=0)
        {
            int k=n%10;
            dig.add(k);
            n=n/10;
            if(!map.containsKey(k))
            map.put(k,1);
            else
            return 0;
        }
        for(int x=1;x<dig.size();x++)
        {
            for(int i=0;i<dig.size()-x;i++)
            {
                int pr=1;
                for(int j=i;j<=i+x;j++)
                {
                    pr=pr*dig.get(j);
                }
                if(!map.containsKey(pr))
                map.put(pr,1);
                else
                return 0;
            }
        }
        return 1;
    }
}
