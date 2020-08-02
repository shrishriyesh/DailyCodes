int Solution::solve(string A) {
string str = A;
reverse(A.begin(),A.end());

int m = str.length();
int o = A.length();

int LCS[m+1][o+1];
for(int i =0; i<=m; i++){

    for(int j =0; j<=o; j++){
        
        if(i==0 || j==0){
            
            LCS[i][j] =0;
        }
     
     else if(str[i-1]== A[j-1]){
         
         
         LCS[i][j] = LCS[i-1][j-1]+1;
        
        
    }
    
    else LCS[i][j] = max(LCS[i][j-1],LCS[i-1][j]);
    
}

}
return LCS[m][o];
}
