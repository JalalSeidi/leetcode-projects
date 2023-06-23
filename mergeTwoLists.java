public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode headF = null;
        ListNode cur = null;

        if( list1 == null ) return list2;

        if( list2 == null ) return list1;

        while( head1 != null && head2 != null ){
            if( head1.val < head2.val ){
                if( headF == null ) {
                    headF = head1;
                    cur = head1;
                }
                else{
                    cur.next = head1;
                    cur = head1;
                }
                head1 = head1.next;

            }
            else{
                if( headF == null ) {
                    headF = head2;
                    cur = head2;
                }
                else{
                    cur.next = head2;
                    cur = head2;
                }
                head2 = head2.next;
            }
        }

        if( head1 != null ){
            while( head1 != null ){
                cur.next = head1;
                cur = head1;
                head1 = head1.next;
            }
        }
        else{
            while( head2 != null ){
                cur.next = head2;
                cur = head2;
                head2 = head2.next;
            }
        }

        return headF;
    }
}
