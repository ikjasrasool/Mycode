class MyLinkedList {
    static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    int l;

    public MyLinkedList() {
        head = null;
        l = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= l) return -1;
        Node t = head;
        for (int i = 0; i < index; i++) {
            t = t.next;
        }
        return t.val;
    }

    public void addAtHead(int val) {
        Node nn = new Node(val);
        nn.next = head;
        head = nn;
        l++;
    }

    public void addAtTail(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = nn;
        }
        l++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > l) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == l) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node nn = new Node(val);
        nn.next = temp.next;
        temp.next = nn;
        l++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= l) return;

        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        l--;
    }
}
