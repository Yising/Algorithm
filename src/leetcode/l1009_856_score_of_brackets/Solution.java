package leetcode.l1009_856_score_of_brackets;

import java.util.Stack;

/**
 * 计算括号内的分数
 *
 * @author yising
 * @since 2022-10-09
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.scoreOfParentheses( "(()(()))"));;
    }


    public int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int total = 0;
        int currentIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                stack.pop();
            }
            if (stack.size() == 0) {
                total += getScore(s.substring(currentIndex, i + 1));
                currentIndex = i + 1;
            }
        }
        return total;
    }

    private int getScore(String s) {
        if (s.equals("()")) {
            return 1;
        }
        Stack<Character> stack = new Stack<>();
        String subBrackets = s.substring(1, s.length() - 1);
        char[] chars = subBrackets.toCharArray();
        int total = 0;
        int currentIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                stack.pop();
            }
            if (stack.size() == 0) {
                total += getScore(subBrackets.substring(currentIndex, i + 1));
                currentIndex = i + 1;
            }
        }
        return total * 2;
    }
}
