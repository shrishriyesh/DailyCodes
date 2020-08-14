public class Solution {
 public int kadanes(int[] arr) {
     int max=arr[0];
     int runSum=arr[0];
     
     for (int i=1;i<arr.length;i++) {
         runSum+=arr[i];
         runSum=Math.max(runSum,arr[i]);
         
         if(runSum>max) {
             max=runSum;
         }
     }
     
     return max;
 }
 
 public int solve(int[][] A) {
     int rows=A.length;
     int cols=A[0].length;
     int max=Integer.MIN_VALUE;
   
     int[] temp = new int[rows];
     for (int j=cols-1;j>=0;j--) {
         
         for (int i=0;i<rows;i++) {
             temp[i] += A[i][j];
         }
         
         int val = kadanes(temp);
         max = Math.max(val,max);
     }
     
     return max;
 }
}
