class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<n;i++)
            for(int j=0;j<i;j++)
                if(j+nums[j]>=i && dp[j]!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],dp[j]+1);
        return dp[n-1]==Integer.MAX_VALUE?false:true;
    }
}