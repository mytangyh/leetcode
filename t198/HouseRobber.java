public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if (nums.length==0) {
            return 0;
        }

        int len=nums.length;
        int[] dp=new int[len+1];
        dp[0]=0;
        dp[1]=nums[0];
        for (int k = 2; k <= len; k++) {
            dp[k]=Math.max(dp[k-1],nums[k-1]+dp[k-2]);
        }
        return dp[len];
    }
}
