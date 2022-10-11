package leetcode.l1012_817_num_components;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 链表组件
 *
 * @author yising
 * @see <a href="https://leetcode.cn/problems/linked-list-components/description/">链表组件</a>
 * @since 2022-10-12
 */
public class Solution {
    public int numComponents(ListNode head, int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        int index = 0;
        while (head != null) {
            int val = head.val;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    list.add(index);
                    break;
                }
            }
            index++;
            head = head.next;
        }
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",")));
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) > 1) {
                count++;
            }
        }
        return count;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
