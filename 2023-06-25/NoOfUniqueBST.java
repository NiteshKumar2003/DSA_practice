class Solution{
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            int j=1;
            while(j<=i){
                dp[i]+=dp[j-1]*dp[i-j];
                j++;
            }
        }
        return dp[n];
    }
}