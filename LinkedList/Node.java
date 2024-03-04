// package LinkedList;

public class Node {
    Node head;
    Node next;
    int value;

    public Node(int data1, Node next1) {
        value = data1;
        next = next1;
    }

    public Node(int x) {
        value = x;
        this.next = null;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr = { 1 };

        Node y = null;
        System.out.println(y);
        LL list = new LL();

        Node temp = list.convertArr2LL(arr);
        int x = list.size(temp);
        // System.out.println("Size " + x);
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
        temp = list.convertArr2LL(arr);

        temp = list.removeNth(temp, 5);

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

    }
}

class LL {
    public static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        int i = 1;
        while (i < arr.length) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
            i++;
        }
        temp.next = null;
        return head;
    }

    public static Node removeNth(Node head, int n) {
        // 1 2 3 4 5 n=2
        int size = size(head);
        Node temp = head;
        int cnt = 0;
        if (head.next == null) {

            return null;
        }
        // if (n == size) {
        // System.out.println("Size " + size);
        // Node newHead = head.next;
        // head = null;
        // return newHead;
        // }
        Node s = head;
        Node e = head;
        int i = 0;
        while (i < n) {
            s = s.next; // 1 2 3 4 5 n=2 s=3
            i++;
            // if (cnt == size - n - 1) {
            // temp.next = temp.next.next;
            // }
            // temp = temp.next;
            // cnt++;
        }
        if (s == null) {
            return head.next;
        }
        while (s.next != null) { // s= 5 e=3
            e = e.next;
            s = s.next;
        }
        e.next = e.next.next;

        return head;

    }

    public static int size(Node head) {
        // 1 2 3 4 5 n=2
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

}
