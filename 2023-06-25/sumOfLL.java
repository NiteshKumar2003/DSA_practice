public class sumOfLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;
        int len1 = length(l1);
        int len2 = length(l2);
        if(len1>=len2) result = add(l1, l2, len1-len2);
        else result = add(l2,l1,len2-len1);

        ListNode t = new ListNode(1);
        if(result.val>9){
            result.val %=10;
            t.next = result;
            return t;
        }
        return result;
    }

    int length(ListNode head){
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current= current.next;
        }
        return length;
    }
    ListNode add(ListNode l1, Listnode l2, int diff){
        if(l1 == null) return null;
        int sum = 0;
        if(diff==0) sum = l1.val+l2.val;
        else sum = l1.val;
        ListNode nextSum;
        if(diff==0) nextSum = add(l1.next, l2.next, diff);
        else nextSum = add(l1.next, l2, diff-1);

        if(nextSum!=null && nextSum.val>9){
            nextSum.val%=10;
            sum+=1;
        }
        ListNode current = new ListNode(sum);
        current.next = nextSum;
        return current;
    }
}