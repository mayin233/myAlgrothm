package my.ch03.linkedList;

import java.util.List;

public class LeetCode206_reverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 2020.8.18 #2
    public ListNode reverseList2(ListNode head){
        ListNode cur = head;
        ListNode pre = null ;
        while (cur!=null){
            ListNode tempNode = cur.next; // 保存下一个节点的信息
            cur.next = pre ;
            pre = cur ;
            cur = tempNode;
        }
        return pre;
    }


    // 2020.8.16 #1
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null; // 前一个结点，默认为空，作为反转后的新链表的头节点
        ListNode cur = head ; // 当前节点
        while (cur!=null){

          ListNode temp =  cur.next; // 保存当前节点的下一个节点信息
          cur.next = pre; // 当前节点的下一个节点，赋值为pre
          pre = cur ; // pre往前移动一个
          cur = temp; // cur往前移动一个
        }

        return pre;
    }


}
