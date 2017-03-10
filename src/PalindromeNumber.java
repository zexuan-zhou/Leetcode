/**
 * Created by Zexuan on 2017/2/20.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int palindromeX = 0;
        int inputX = x;
        while (x > 0) {
            palindromeX = palindromeX * 10 + (x % 10);
            x /= 10;
        }
        return inputX == palindromeX;
    }
}
