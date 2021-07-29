import java.util.ArrayList;

/**
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 * <p>
 * 如输入{1,2,3}的链表如下图:
 * <p>
 * 返回一个数组为[3,2,1]
 * <p>
 * 0 <= 链表长度 <= 1000
 */

public class ThreeTest {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            arrayList.add(0, tmp.val);
            tmp = tmp.next;
        }
        return arrayList;
    }
}
