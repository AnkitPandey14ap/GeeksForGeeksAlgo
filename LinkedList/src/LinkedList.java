public class LinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void pushInFront(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void pushAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void pushAfterGivenNode(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("Previous node can't be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void displayAllNodes() {
        System.out.println("\nCreated Linked list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void displayAllNodes(Node head) {
        System.out.println("\nCreated Linked list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    void reversLinkedList() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList llist = new LinkedList();

        // Insert 6.  So linked list becomes 6->NUllist
        llist.pushAtEnd(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.pushInFront(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.pushInFront(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.pushAtEnd(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.pushAfterGivenNode(llist.head.next, 8);
        llist.displayAllNodes();
        llist.reversLinkedList();
        llist.displayAllNodes();

    }

}
