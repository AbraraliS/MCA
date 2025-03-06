
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class Test {
    // Travesing
    private static Node convert2All(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node print(Node head) {
        if (head == null) {
            return head;
        }
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
        return head;
    }

    private static int countLL(Node head) {
        int cnt = 0;
        if (head == null) {
            return cnt;
        }
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    private static int searchLL(Node head) {
        if (head == null) {
            return 0;
        }

        int key = 5;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
               return 1;
            }
            temp = temp.next;
        }
        return 0;

    }
    
    private static Node headDelete(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    private static Node tailDelete(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7 };
        // Node head = new Node(arr[0]);
        // System.out.println(head.data);
        Node head = convert2All(arr);
        print(head);
        // System.out.println("");
        // System.out.println(countLL(head));
        // System.out.println(searchLL(head));
        // System.out.println("");
        // head = headDelete(head);
        // print(head);
        // head = tailDelete(head);
        print(head);


          // Insert Tail
          head = new Node(200, head);
          print(head);

    }
}
