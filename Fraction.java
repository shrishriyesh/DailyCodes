public class Solution {
    public String fractionToDecimal(long A, long B) 
    {
        HashMap<Long,Integer> map=new HashMap<>();
        StringBuilder sb= new StringBuilder();
        if(A<0&&B>0||A>0&&B<0)
        sb.append('-');
        A=Math.abs(A);
        B=Math.abs(B);
        if(A%B==0)
        {
            sb.append(Long.toString(A/B));
            return sb.toString();
        }
        else
        {
            long div=A/B;
            sb.append(Long.toString(div));
           
        }
         long rem=A%B;
        sb.append('.');
        
        while(rem!=0)
        {
            if(!map.containsKey(rem))
            {
                map.put(rem,sb.length());
                rem*=10;
                sb.append(Long.toString(rem/B));
                rem=rem%B;
            }
            else
            {
                sb.insert((int)map.get(rem),'(');
                sb.append(')');
                return sb.toString();
            }
        }
        return sb.toString();
        
    }
}
