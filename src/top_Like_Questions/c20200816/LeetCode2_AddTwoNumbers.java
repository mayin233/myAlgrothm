package top_Like_Questions.c20200816;

public class LeetCode2_AddTwoNumbers {

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
    // 2020.8.18 #2
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int n1 = 0; // l1的val
        int n2 = 0; // l2的val
        int ca = 0; // 进位
        ListNode dummyHead  = new ListNode(0);
        ListNode cur = dummyHead;
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null || node2!=null){
            n1 = node1!=null?node1.val:0;
            n2 = node2!=null?node2.val:0;
            int sum = n1+n2+ca ;
            ca = sum /10;
            ListNode newNode = new ListNode(sum%10);
            cur.next = newNode;
            cur = cur.next;
            if(node1!=null){
                node1 = node1.next;
            }
            if(node2!=null){
                node2 = node2.next;
            }
        }
        if(ca>0){
           cur.next = new ListNode(1);
        }
        return dummyHead.next;
    }



    // 2020.8.16 #1
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // 定义一个虚拟头节点
        ListNode cur = dummyHead; // 定义一个当前节点，并让当前节点等于头节点
        int ca = 0; // 进位
        int n1 = 0; // l1当前节点的值
        int n2 = 0; // l2当前节点的值
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null || node2 != null) {
            n1 = node1 == null ? 0 : node1.val;
            n2 = node2 == null ? 0 : node2.val;
            int sum = n1 + n2 + ca; // 计算值 ,2数相加，再加进位
            ca = sum / 10; // 进位
            ListNode curNewNode = new ListNode(sum % 10); // 新建一个节点，值是2个数字相加之后取模。得到的个位数
            cur.next = curNewNode;
            cur = cur.next; // cur向后移动一步
            if(node1!=null){
                node1 = node1.next;
            }
            if(node2 !=null){
                node2 = node2.next;
            }
        }
        // 计算最后一位是不是要加上进位信息
        if(ca > 0){
            cur.next = new ListNode(ca);
        }

        return dummyHead.next;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseListNode(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tempNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tempNode;
        }
        return pre;

    }
}
