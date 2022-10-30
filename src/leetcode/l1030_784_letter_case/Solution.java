package leetcode.l1030_784_letter_case;

import java.util.ArrayList;
import java.util.List;

/**
 * 字母大小写全排列, pass
 *
 * @author yising
 * @since 2022.10.30
 */
public class Solution {
    private List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(String.join(", ", solution.letterCasePermutation("a1b2")));
        System.out.println(String.join(", ", solution.letterCasePermutation("3z4")));
    }

    public List<String> letterCasePermutation(String s) {
        getString(s.toLowerCase(), "", 0);
        return result;
    }

    private void getString(String s, String pre, int index) {
        if (index == s.length()) {
            result.add(pre);
            return;
        }
        char current = s.charAt(index);
        if (current >= '0' && current <= '9') {
            getString(s, pre + current, index + 1);
        } else {
            getString(s, pre + current, index + 1);
            getString(s, pre + (char) (current - 32), index + 1);
        }
    }
}
