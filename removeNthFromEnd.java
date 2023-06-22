public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 0) return head;
        ListNode sizeCountHead = head;
        int iterator = 1;
        int listSize = 0;

        while(sizeCountHead!=null){
            listSize++;
            sizeCountHead = sizeCountHead.next;
        }

        if(listSize == n){
            return head.next;
        }

        ListNode originalHead = head;
        while(listSize - n != iterator){
            head = head.next;
            iterator++;
        }
        head.next = head.next.next;
        return originalHead;
    }
}
