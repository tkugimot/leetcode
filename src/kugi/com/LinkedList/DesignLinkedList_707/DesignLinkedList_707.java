package kugi.com.LinkedList.DesignLinkedList_707;
class MyLinkedList {
    Node head;
    int nodeLength;

    static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node() {
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index > nodeLength -1) return -1;

        Node tmp = head;
        for (int i=0; i<index; i++) {
            tmp = tmp.next;
        }

        return tmp.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (nodeLength == 0) {
            this.head = new Node(val);
            this.nodeLength++;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.nodeLength++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (nodeLength == 0) {
            this.head = new Node(val);
            this.nodeLength++;
            return;
        }
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(val);
        this.nodeLength++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > this.nodeLength) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == this.nodeLength) {
            addAtTail(val);
            return;
        }

        Node tmp = head;
        int currentIndex = 1;
        while(currentIndex < index) {
            tmp = tmp.next;
            currentIndex++;
        }
        Node next = tmp.next;
        Node newNode = new Node(val);
        newNode.next = next;
        tmp.next = newNode;
        this.nodeLength++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= this.nodeLength) {
            return;
        }

        if (index == 0) {
            head = head.next;
            this.nodeLength--;
            return;
        }

        int currentIndex = 1;
        Node tmp = head;
        while(currentIndex < index) {
            tmp = tmp.next;
            currentIndex++;
        }
        tmp.next = tmp.next.next;
        this.nodeLength--;
    }
}

