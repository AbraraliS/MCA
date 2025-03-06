package List;

class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data2) {
        this.data = data2;
        this.next = null;
    }

}

public class SingleLinkedList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Node y;
        y = new Node(arr[0]);
        System.out.println(y);
        System.out.println(y.next);
        System.out.println(y.data);
    }
}
