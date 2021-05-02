import java.util.HashMap;
import java.util.List;
import java.util.Map;
// https://leetcode-cn.com/problems/brick-wall/
public class wall {
    public static void main(String[] args) {
        System.out.println("www");
    }
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (List<Integer> list : wall) {
            int sum = 0;
            for (int a : list) {
                sum += a;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            map.remove(sum);
        }
        int ans=0;
        for(int u:map.keySet()){
            int cnt=map.get(u);
            ans=Math.min(ans, wall.size()-cnt);
        }
        return ans;

    }
    // public int leastBricks(List<List<Integer>> wall) {
    //     int n = wall.size();
    //       Map<Integer, Integer> map = new HashMap<>();
    //       for (int i = 0, sum = 0; i < n; i++, sum = 0) {
    //           for (int cur : wall.get(i)) {
    //               sum += cur;
    //               map.put(sum, map.getOrDefault(sum, 0) + 1);
    //           }
    //           map.remove(sum); // 不能从两边穿过，需要 remove 掉最后一个
    //       }
    //       int ans = n;
    //       for (int u : map.keySet()) {
    //           int cnt = map.get(u);
    //           ans = Math.min(ans, n - cnt);
    //       }
    //       return ans;
    //   }
}
