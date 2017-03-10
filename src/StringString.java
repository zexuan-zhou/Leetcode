/**
 * Created by Zexuan on 2017/2/27.
 */
public class StringString {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null) return -1;
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == target.length()) return i;
                if (i + j == source.length()) return -1;
                if (source.charAt(i + j) != target.charAt(j)) break;
            }
        }
    }
}
