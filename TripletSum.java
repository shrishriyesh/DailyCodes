public class Solution {
    public int solve(ArrayList<String> A) {
        Collections.sort(A);
         int start=0,end=A.size()-1;
    
    while(end-start>=2) // atleast 3 elements
    {
        int mid=(start+end)/2;
        double a=Double.parseDouble(A.get(start));
        double b=Double.parseDouble(A.get(mid));
        double c=Double.parseDouble(A.get(end));
        double sum=a+b+c;
        
        if(sum>2)
            end--;
        else if(sum<1)
            start++;
        else
            return 1;
    }
    
    return 0;
}
    }

OR
//Normal Sort
public class Solution {
    public int solve(String[] A) {
        double arr[]=new double[A.length];
        for(int i=0;i<A.length;i++)
        {
            arr[i]=Double.parseDouble(A[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<A.length-2;i++)
        {
            // double f=Double.parseDouble(A[i]);
            // double s=Double.parseDouble(A[i+1]);
            // double t=Double.parseDouble(A[i+2]);
            if((arr[i]+arr[i+1]+arr[i+2]>1)&&(arr[i]+arr[i+1]+arr[i+2]<2))
            return 1;
        }
        return 0;
    }
}
OR
// Sliding window

public class Solution {
    public int solve(String[] A) {
        
        double a = Double.parseDouble(A[0]); 
        double b = Double.parseDouble(A[1]); 
        double c = Double.parseDouble(A[2]); 
        
        for(int i = 3; i < A.length; i ++){
            if((a+b+c) > 1 && (a+b+c) < 2){
                return 1;
            }
            else if((a+b+c) >= 2){
                if(a > b && a > c){
                    a = Double.parseDouble(A[i]);
                }
                else if( b > c){
                    b = Double.parseDouble(A[i]);
                }
                else{
                    c = Double.parseDouble(A[i]);
                }
            }
            else{
                if(a < b && a < c){
                    a = Double.parseDouble(A[i]);
                }
                else if( b < c){
                    b = Double.parseDouble(A[i]);
                }
                else{
                    c = Double.parseDouble(A[i]);
                }
            }
        }
        // check for last a, b, c  pair
        if((a+b+c) > 1 && (a+b+c) < 2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
