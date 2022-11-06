package leetcode.l1106_1678_interpret;

/**
 * 设计 Goal 解析器
 *
 * @author yising
 * @since 2022.11.06
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.interpret("G()(al)"));
        System.out.println(solution.interpret("G()()()()(al)"));
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }
    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
