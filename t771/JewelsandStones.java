public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
