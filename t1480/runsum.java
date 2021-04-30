import java.util.Arrays;

public class runsum {
    public static void main(String[] args) {
        int[] nums={3,1,2,10,1};
        int[] rs= runningSum(nums);
        // for (int i : rs) {
        //     System.out.println(i);
        // }
       System.out.println(Arrays.toString(rs)); 
    }
    public static int[] runningSum(int[] nums) {
       int  runningSum[]=new int[nums.length];
       int temp=0;
        for (int i = 0; i < nums.length; i++) {
            runningSum[i]=nums[i]+temp;
            temp=runningSum[i];
        }
        return runningSum;

    }
}
