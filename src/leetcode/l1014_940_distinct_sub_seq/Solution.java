package leetcode.l1014_940_distinct_sub_seq;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * 不同的子序列Ⅱ
 *
 * @author yising
 * @since 2022-10-14
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = new char[10];
        for (int i = 0; i < 10; i++) {
            char c = (char) ('a' +  new Random().nextInt(26));
            chars[i] = c;
        }
        String str = new String(chars);
        System.out.println(str);
        System.out.println(solution.distinctSubseqII(str));
        System.out.println(solution.distinctSubseqII("abc"));//7
        System.out.println(solution.distinctSubseqII("adb"));//7
        System.out.println(solution.distinctSubseqII("aba"));//6
        System.out.println(solution.distinctSubseqII("baa"));//5
        System.out.println(solution.distinctSubseqII("aaa"));//3
        System.out.println(solution.distinctSubseqII("pcrdhwdxmqdznbenhwjsen"));//3
        System.out.println(solution.distinctSubseqII("pcrdhwdxmqdznbenhwjsenjhvulyve"));
    }
    public int distinctSubseqII(String s) {
        long surplus = 7L + 10L * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10;
        long count = 0;
        Set<Node> parent = getNodes(s);
        count += parent.size();
        while (true) {
            Set<Node> child = getSubNode(parent);
            if (child.size() == 0) {
                return (int) count;
            }
            count += child.size();
            count = count % surplus;
            parent = child;
        }
    }

    public int distinctSubseqIIOld(String s) {
        char[] chars = s.toCharArray();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < chars.length; i++) {
            Set<String> addString = new LinkedHashSet<>();
            for (String item : set) {
                addString.add(item.concat(String.valueOf(chars[i])));
            }
            addString.add(String.valueOf(chars[i]));
            set.addAll(addString);
        }
        return set.size();
    }

    private Set<Node> getSubNode(Set<Node> parent) {
        Set<Node> child = new LinkedHashSet<>();
        for(Node node : parent) {
            String subString = node.subString;
            if (subString == null || subString.length() == 0) {
                continue;
            }
            child.addAll(getNodes(subString));
        }
        return child;
    }

    private Set<Node> getNodes(String s) {
        Set<Node> nodeSet = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (i != s.indexOf(String.valueOf(current))) {
                continue;
            }
            Node newNode = new Node(s.charAt(i), s.substring(i + 1));
            nodeSet.add(newNode);
        }
        return nodeSet;
    }

    private class Node {
        private char val;

        private String subString;

        public Node(char val, String subString) {
            this.val = val;
            this.subString = subString;
        }
    }
}
