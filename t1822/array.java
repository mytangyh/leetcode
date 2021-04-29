package t1822;
public class array {
    public static void main(String[] args) {
        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int a=arraySign(nums);
        System.out.println(a);

    }
    public static int arraySign(int[] nums) {
        int count=0;
        for (int i : nums) {
            if(i==0){
                return 0;
            }
            if(i<0){
                count++;
            }
        }
       if(count%2==0){
        return 1;
       }
        return -1;
    }
   

}
/**
 * 不需要计算乘积 只需要统计负数个数
 */