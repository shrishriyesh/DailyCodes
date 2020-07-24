public class Solution {
public int nchoc(int A, ArrayList<Integer> B) 
    {
    PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<B.size();i++)
    {
        pq.add((long)B.get(i));
    }
    long sum=0;
    while(A>0)
    {
        A--;
        long num=pq.poll();
        sum+=num;
        pq.add(num/2);
    }
    return (int)(sum%1000000007);
    }
}
