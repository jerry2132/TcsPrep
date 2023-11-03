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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }

        ListNode current = new ListNode(-1);
        ListNode list3 = current;

        while(list1!= null && list2!=null)
        {
            if(list1.val<list2.val){
            // //list3=list1;
            // list1.next = mergeTwoLists(list1.next,list2);
            // return list1;
            list3.next = list1;
            list1 = list1.next;
            }
            else {
            // //list3=list2;
            // list2.next = mergeTwoLists(list2.next,list1);
            // return list2;
            list3.next = list2;
            list2 = list2.next;
            }

            list3= list3.next;
        }

        if(list1!=null)
        {
            list3.next = list1;
        }

        else
        {
            list3.next = list2;
        }


        return current.next;
    }

}