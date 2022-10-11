package leetcode.l1011_1790_are_almost_equal;

/**
 * 仅执行一次字符串交换能否使两个字符串相等，pass
 *
 * @author yising
 * @since 2022-10-11
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(solution.areAlmostEqual(s1, s2));
    }

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int[] diffIndex = new int[2];
        int index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (index >= 2) {
                    return false;
                }
                diffIndex[index++] = i;
            }
        }
        if (index != 2) {
            return false;
        }
        return s1.charAt(diffIndex[0]) == s2.charAt(diffIndex[1]) && s1.charAt(diffIndex[1]) == s2.charAt(diffIndex[0]);
    }

    public boolean areAlmostEqualOld(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            for (int j = i + 1; j < chars2.length; j++) {
                char[] temp = chars2.clone();
                temp[i] = chars2[j];
                temp[j] = chars2[i];
                if (s1.equals(new String(temp))) {
                    return true;
                }
            }
        }
        return false;
    }
}
