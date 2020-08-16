public class Solution {
    // public int seats(String A) {
    //     ArrayList<Integer> n=new ArrayList<>();
    //     int c=0;
    //     for(int i=0;i<A.length();i++)
    //     {
    //         if(A.charAt(i)=='x')
    //         {
    //             n.add(i-c);
    //             c++;
    //         }
    //     }
    //     if(n.size()==0||n.size()==1)
    //     return 0;
    //     int med=0;
    //     if(c%2==0)
    //     med=n.get(c/2);
    //     else
    //     med=(n.get((int)Math.floor(c/2))+n.get((int)Math.ceil(c/2)))/2;
    //     int ans=0;
    //     for(int i=0;i<n.size();i++)
    //     {
    //         ans+=Math.abs(n.get(i)-med)%10000003;
    //     }
    //     return ans;
    // }
    public int seats(String A) {
    int n = A.length();
    if(n < 2){
        return 0;
    }
    int[] arr = new int[n];
    int lastIndex = 0;
    for(int i = 0; i < n; i++){
        if(A.charAt(i) == 'x'){
            arr[lastIndex] = i;
            lastIndex++;
        }
    }
    lastIndex--;
    int medIndex = (lastIndex+1)/2;
    int ans = 0, MOD = 10000003;
    for(int i = 0; i < lastIndex+1; i++){
        ans = (ans % MOD + (Math.abs(arr[medIndex] - arr[i]) % MOD) 
                - Math.abs(medIndex - i) % MOD) % MOD;
    }
    return ans % MOD;
}
}
