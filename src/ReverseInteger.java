/**
 * Created by Zexuan on 2017/2/19.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reverse;
    }
    public static void main(String args[]) {
        int x = 1534236469;
        ReverseInteger solution = new ReverseInteger();
        System.out.println(solution.reverse(x));
    }
}
