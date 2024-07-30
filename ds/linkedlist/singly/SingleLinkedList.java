package ds.linkedlist.singly;
public class SingleLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        // Constructor for ListNode
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Constructor for SingleLinkedList
    public SingleLinkedList() {
        this.head = null;
    }

    public static void main(String[] args) {
        SingleLinkedList sln = new SingleLinkedList();
        sln.head = new ListNode(10);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sln.head.next = second;
        second.next = third;
        third.next = fourth;
    }
}
