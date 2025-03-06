package LinkedList;

// import org.junit.platform.engine.support.hierarchical.Node;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        // Links
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }

    };

    // Traversing
    private static Node convertArr2All(int[] arr) {
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

    // Count Elements.
    private static int length0fll(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    // Search
    private static boolean checkIfPresent(Node head, int val) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Remove Head
    private static Node removeHead(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    // print elements
    private static void print(Node head) {
        while (head != null) {
            System.out.print("[" + head.data + "] -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    // Remove Tail Element
    private static Node removeTail(Node head) {
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

    // Removec selected element
    private static Node removeSel(Node head, int ele) {
        if (head == null) {
            return head;
        }
        if (head.data == ele) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == ele) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Remove K element
    private static Node removeKel(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (k == cnt) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // Insert Head
    private static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }

    // Insert Tail
    private static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // Insert K element
    private static Node insertKele(Node head, int ele, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(ele);
            } else {
                return null;
            }
        }
        if (k == 1) {
            // Node temp = new Node(ele, head);
            // return temp;
            return new Node(ele, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // Insert Element before selected value
    private static Node insertEleBeforeVal(Node head, int ele, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            // Node temp = new Node(ele, head);
            // return temp;
            return new Node(ele, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node x = new Node(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 14, 2, 3, 4, 5 };
        Node head = convertArr2All(arr);
        // Printing.
        System.out.print("Elements Are : ");
        print(head);
        /*
         * Node temp = head;
         * while (temp != null) {
         * System.out.println(temp.data);
         * temp = temp.next;
         * }
         */
        // Counter
        System.out.println("Lenght of LL : " + length0fll(head));
        // Search
        System.out.println("The Element is Present ? " + (checkIfPresent(head, 5) ? "Yes" : "No"));
        // Remove Head
        head = removeHead(head);
        System.out.print("Head Removed : ");
        print(head);
        // Remove Tail
        head = removeTail(head);
        System.out.print("Tail Removed : ");
        print(head);
        // Remove Selected Element
        System.out.print("Selected Element Removed : ");
        head = removeSel(head, 3);
        print(head);
        // Remove K Element
        System.out.print("K Element Removed : ");
        head = removeKel(head, 1);
        print(head);
        // Insert Head
        System.out.print("New Head Inserted : ");
        head = insertHead(head, 100);
        print(head);
        // Insert Tail
        System.out.print("New Tail Inserted : ");
        head = insertTail(head, 200);
        print(head);
        // Insert K element
        System.out.print("New K element Inserted : ");
        head = insertKele(head, 400, 3);
        print(head);
        // Insert element before Value
        System.out.print("New element before selected Value : ");
        head = insertEleBeforeVal(head, 500, 400);
        print(head);

    }
}
