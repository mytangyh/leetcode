public class leftStr {
    public static void main(String[] args) {
        String s="abcfefg";
        int k=5;
        System.out.println(reverseLeftWords(s, k));
    }
    public static String reverseLeftWords(String s, int n) {
        if(n == 0) return s;
        return s.substring(n)+s.substring(0,n);
    }
}
