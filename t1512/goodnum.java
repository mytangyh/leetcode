public class goodnum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs1(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int numIdenticalPairs1(int[] nums) {
        int ans = 0;
        //因为 1<= nums[i] <= 100  所以申请大小为100的数组
        //temp用来记录num的个数
        int[] temp = new int[100];
        /*
        从前面开始遍历nums
        假设nums = [1,1,1,1]
        第一遍
        temp是[0,0,0,0]
        ans+=0;
        temp[0]++;
        第二遍
        temp是[1,0,0,0]
        ans+=1;
        temp[0]++;
        第三遍
        temp=[2,0,0,0]
        ans+=2;
        temp[0]++;
        第四遍
        temp=[3,0,0,0]
        ans+=3;
        temp[0]++;
        */
        for (int num : nums) {
            
           
            ans+=temp[num - 1];
            temp[num - 1]++;
            
           // ans += temp[num - 1]++;
        }
        return ans;
    }

}
