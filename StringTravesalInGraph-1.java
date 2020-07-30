int helper(char Graph[][MAXN] , int N , int M , bool **visited , string s , int x , int y) {
    if(s.size() == 0) {
        return 1;
    }

    if(x < 0 || x > N - 1) {
        return 0;
    }
    if(y < 0 || y > M - 1) {
        return 0;
    }

    if(s[0] == Graph[x][y] && visited[x][y] == false) {
        visited[x][y] = true;
    } else {
        return 0;
    }

    int ans1 = helper(Graph , N , M , visited , s.substr(1) , x + 1 , y);
    if(ans1 == 1) {
        return 1;
    }
    int ans2 = helper(Graph , N , M , visited , s.substr(1) , x + 1 , y + 1);
    if(ans2 == 1) {
        return 1;
    }
    int ans3 = helper(Graph , N , M , visited , s.substr(1) , x , y + 1);
    if(ans3 == 1) {
        return 1;
    }
    int ans4 = helper(Graph , N , M , visited , s.substr(1) , x - 1 , y + 1);
    if(ans4 == 1) {
        return 1;
    }
    int ans5 = helper(Graph , N , M , visited , s.substr(1) , x - 1 , y);
    if(ans5 == 1) {
        return 1;
    }
    int ans6 = helper(Graph , N , M , visited , s.substr(1) , x - 1 , y - 1);
    if(ans6 == 1) {
        return 1;
    }
    int ans7 = helper(Graph , N , M , visited , s.substr(1) , x , y - 1);
    if(ans7 == 1) {
        return 1;
    }
    int ans8 = helper(Graph , N , M , visited , s.substr(1) , x + 1 , y - 1);
    if(ans8 == 1) {
        return 1;
    }
    // mark them false so that they can be consider in the next path.
    visited[x][y]=false;

    return 0;
}

int solve(char Graph[][MAXN],int N, int M)
{
        Write your code here.
    bool **visited = new bool*[N];
    for(int k = 0 ; k < M ; k ++) {
        visited[k] = new bool[M];
    }
    for(int i = 0 ; i < N ; i ++) {
        for(int j = 0 ; j < M ; j ++) {
            if(Graph[i][j] == 'C') {
                for(int k = 0 ; k < N ; k ++) {
                    for(int l = 0 ; l < M ; l ++) {
                        visited[k][l] = 0;
                    }
                }
                int ans = helper(Graph , N , M , visited , "CODINGNINJA" , i , j);
                if(ans == 1) {
                    return ans;
                }
            }
        }
    }
    return 0;
}
