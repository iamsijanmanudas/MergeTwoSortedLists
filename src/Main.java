import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Input: list1 = [1,2,4], list2 = [1,3,4]
        // Output: [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = mergeTwoLists(list1, list2);
        // mergedList = [1,1,2,3,4,4]
        //output to screen
        // 1 -> 1 -> 2 -> 3 -> 4 -> 4
        ListNode current = mergedList;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

    }
        /*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by
 splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



    public static ListNode  mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode current = mergedList;

        ListNode p1 = list1;
        ListNode p2 = list2;
        // While both input lists are not empty
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val){
                // Add p1 to merged list
                // Move p1 to next node
                   // Move current pointer to next node
                current.next = p1;
                p1 = p1.next;
            } else {
                // p2.val < p1.val
                // Add p2 to merged list
                // Move p2 to next node
                // Move current pointer to next node
                current.next = p2;
                p2 = p2.next;
            }
            // Move current pointer to next node
            current = current.next;



        }

        // If p1 is not empty, add p1 to merged list
        if (p1 != null) {
            current.next = p1;
        }
        // If p2 is not empty, add p2 to merged list
        if (p2 != null) {
            current.next = p2;
        }
        return mergedList;
    }


}
