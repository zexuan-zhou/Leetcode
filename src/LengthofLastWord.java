/**
 * Created by Zexuan on 2017/2/26.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int index = s.length();

        while (index > 0 && s.charAt(index - 1) == ' ') {
            index --;
        }

        while (index > 0 && s.charAt(index - 1) != ' ') {
            index --;
            len ++;
        }
        return len;
    }
}
