class LongestIncresingSubsequence{
    static int[] dp;
    
    static int LIS(int[] arr,int i){                           //longest inceasing subsequnce till ith index of array
        if(dp[i]!=0)
            return dp[i];
        int max=1;
        for(int j=0;j<i;j++){
            if(arr[j]<arr[i])
                max=Math.max(max,LIS(arr,j)+1);
        }
        dp[i]=max;
        return dp[i];
    }
    
    public int lengthOfLIS(int[] nums) {                         // max(LIS(arr[0]),LIS(arr[1]),.........,LIS(arr[n-1]))
        int n=nums.length;
        dp=new int[n];
        int max=1;
        for(int i=0;i<n;i++){
            max=Math.max(max,LIS(nums,i));
        }
        return max;                                            // returing max of all LIS
    }
}
