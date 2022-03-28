package com.zu1y.interview;

/**
 * 题目：将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 *
 *
 * -1000 <= Node.val <= 1000, l1 和 l2 均按 非递减顺序 排列, 节点数少于50
 */
public class LinkNodeMerge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return null;
    }
}

class ListNode {
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