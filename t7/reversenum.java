/**
 * reversenum
 */
public class reversenum {

    public static void main(String[] args) {
        int x=1147483641;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        long a=0;int temp=0;
        while (x!=0) {
           temp=x%10;
           a=a*10+temp;
           x/=10;
        }
        if ((int)a==a) {
        
            return (int)a;
            
        }
        return 0;
    }
}