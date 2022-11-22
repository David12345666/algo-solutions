package LiskedList;

public class ListNode {
    public ListNode next;
    public int value;
    public ListNode() {
        this.next = null;
        this.value = -1;
    }
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public void print() {
        System.out.print(this.value + " ");
        if (this.next == null) {
            return;
        }
        this.next.print();
    }
}
