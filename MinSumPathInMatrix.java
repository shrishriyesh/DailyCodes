public class Solution {
    public int minPathSum(int[][] arr) {
        int r = arr.length;
int c = arr[0].length;
int arr01[][] = new int[r][c];
return check(arr,arr01,r,c);
}

public int check (int arr[][],int newArr[][],int r,int c){
	newArr[0][0] = arr[0][0];
	for(int i=1;i<c;i++){
		newArr[0][i] =arr[0][i]+ newArr[0][i-1]; 
	}
	for(int i=1;i<r;i++){
		newArr[i][0] =arr[i][0]+newArr[i-1][0];
	}

	for(int i=1;i<r;i++){
		for(int j=1;j<c;j++){
			newArr[i][j] = arr[i][j]+Math.min(newArr[i][j-1],newArr[i-1][j]);
		}
	}
	return newArr[r-1][c-1];
}
}
