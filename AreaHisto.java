public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        if(A.size()==1)
        return A.get(0);
        Stack<Integer> st=new Stack<>();
        int i=0;int max=0;int area=0;
        while(i<A.size())
        {
            if(st.isEmpty()||A.get(st.peek())<=A.get(i))
            {
                st.push(i);
                i++;
            }
            else
            {
                int temp=st.pop();
                if(st.isEmpty())
                area=A.get(temp)*i;
                else
                area=A.get(temp)*(i-st.peek()-1);
                if(area>max)
                max=area;
            }
            
        }
        while(!st.isEmpty())
        {
            int temp=st.pop();
                if(st.isEmpty())
                area=A.get(temp)*i;
                else
                area=A.get(temp)*(i-st.peek()-1);
                if(area>max)
                max=area;
        }
        return max;
    }
}
