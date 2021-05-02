import java.util.HashMap;
import java.util.Map;

public class onlynum {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,1,99};
       System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans=0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue()==1){
                ans=entry.getKey();
                break;
             }
        }
        return ans;
    }
}
