public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> stk = new Stack();
ArrayList<Integer> lst = new ArrayList();
for(int i=0;i<A.size();i++){
while(!stk.empty()&&(stk.peek()>=A.get(i))){
stk.pop();
}
if(stk.empty()){
lst.add(-1);
}
else{
lst.add(stk.peek());
}
stk.push(A.get(i));
}
return lst;
}
}
