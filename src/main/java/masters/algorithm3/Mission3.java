package masters.algorithm3;

import java.util.ArrayList;
import java.util.List;

public class Mission3 {
     public class ListNode { int val; ListNode next; ListNode() {} ListNode(int
     val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val; this.next = next; } }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> varList = new ArrayList<>();
        List<ListNode> list = new ArrayList<>();
        varList.add(head.val);

        ListNode subNode = new ListNode(head.val, head.next);
        int subNodeVal = 0;

        while (subNode.next != null) {
            subNode = subNode.next;
            subNodeVal = subNode.val;

            if (!varList.contains(subNodeVal)) {
                varList.add(subNodeVal);
            }
        }

        for (int i = 0; i < varList.size(); i++) {
            list.add(new ListNode(varList.get(i)));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        ListNode answer = list.get(0);
        return answer;
    }
}
