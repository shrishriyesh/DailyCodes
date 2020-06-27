class Solution {
    // ArrayList<Integer> arr=new ArrayList<>();
    // ArrayList<Integer> marr=new ArrayList<>();
    // int min;
    // int top;
    // public void Solution()
    // {
    //     min=-1;
    //     top=-1;
    // }
    // public void push(int x) {
    //     arr.add(x);
    //     top++;
    //     if(min==-1)
    //     min=x;
    //     if(min>=x)
    //     {min=x;
    //     marr.add(x);}
    // }

    // public void pop() {
    //     if(top!=-1)
    //     {setMin(top);
    //     arr.remove(top);
    //     top--;
    //     }
    // }

    // public int top() {
    //     if(top!=-1)
    //     return arr.get(top);
    //     else
    //     return -1;
    // }

    // public int getMin() {
    //     if(top!=-1)
    //     return marr.get(marr.size()-1);
    //     else
    //     return -1;
    // }
    // public void setMin(int x)
    // {
    //     marr.remove(x);
    // }
    Stack<Integer> stk = new Stack<>();
Stack<Integer> minstk = new Stack<>();

public void push(int x) {
    stk.push(x);
    if(minstk.empty()||minstk.peek()>=x){
        minstk.push(x);
    }
}

public void pop() {
    if(stk.empty())
        return;
    int y = stk.pop();
    if(y==minstk.peek()){
        minstk.pop();
    }
}

public int top() {
    if(stk.empty())
        return -1;
    return stk.peek();
}

public int getMin() {
    if(minstk.empty())
        return -1;
    return minstk.peek();
}
}
