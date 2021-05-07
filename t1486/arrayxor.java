public class arrayxor {
    public static void main(String[] args) {
        int n = 1, start = 7;
        System.out.println(xorOperation(n, start));
    }
    public static int xorOperation(int n, int start) {
       int[] nums=new int[n];
       int ans=0;
       for (int i = 0; i < nums.length; i++) {
           nums[i]=start+2*i;
           ans=ans^nums[i];
       }
        return ans;

    }
}