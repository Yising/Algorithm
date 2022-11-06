package leetcode.l1103_1668_max_repeat;

/**
 *最大重复子字符串，pass
 *
 * @author yising
 * @since 2022.11.03
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxRepeating("ababc", "ab"));
        System.out.println(solution.maxRepeating("ababc", "ba"));
        System.out.println(solution.maxRepeating("ababc", "ac"));
        System.out.println(solution.maxRepeating("aaaaaaaaaa", "a"));
        System.out.println(solution.maxRepeating("a", "a"));
    }
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        int length = word.length();
        for (int i = 0; i <= sequence.length() - length; i++) {
            if (sequence.substring(i, i + length).equals(word)) {
                int count = 1;
                int j = i + length;
                while ((j + length) <= sequence.length() && sequence.substring(j, j + length).equals(word)) {
                    j = j + length;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
