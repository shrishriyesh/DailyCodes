public class Solution {
    public int solve(String A, String B, String[] C) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<C.length;i++)
        {
            set.add(C[i]);
        }
        if(!set.contains(B))
        return 0;
        Queue<String> q=new LinkedList<>();
        q.add(A);
        int level=1;
        while(!q.isEmpty())
        {int size=q.size();
            for(int i=0;i<size;i++)
            {
                String curr=q.poll();
                char word[]=curr.toCharArray();
                for(int j=0;j<curr.length();j++)
                {
                    char save=word[j];
                    for(char k='a';k<='z';k++)
                    {
                        if(word[j]==k)
                        continue;
                        word[j]=k;
                        String nword=String.valueOf(word);
                        //System.out.println(nword);
                        if(nword.equals(B))
                        return level+1;
                        if(set.contains(nword))
                        {
                            q.add(nword);
                            set.remove(nword);
                        }
                    }
                    word[j]=save;
                }
            }
            level++;
        }
        return 0;
    }
}

