package leetcode.l1101_1662_array_string_equal;

/**
 * 检查两个字符串数组是否相等，pass
 *
 * @author yising
 * @since 2022.11.01
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(solution.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
