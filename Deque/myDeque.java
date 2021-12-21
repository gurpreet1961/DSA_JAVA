public class myDeque<E> {

    Node<E> head;
    Node<E> tail;

    public void addToHead(E data) {
        Node<E> toAdd = new Node<>(data);

        if (head == null) {
            head = tail = toAdd;
            return;
        }
        head.next = toAdd;
        toAdd.prev = head;
        head = toAdd;
    }

    public void addToTail(E data) {
        Node<E> toAdd = new Node<>(data);

        if (head == null) {
            head = tail = toAdd;
            return;
        }

        tail.prev = toAdd;
        toAdd.next = tail;
        tail = toAdd;

    }

    public E removeToTail() {

        if (head == null) {
            return null;
        }
        Node<E> toRemove = tail;
        tail = tail.next;
        tail.prev = null;

        if (tail == null) {
            head = null;
        }

        return toRemove.data;
    }

    public E removeToHead() {
        if (head == null) {
            return null;
        }
        Node<E> toRemove = head;
        head = head.prev;
        head.next = null;

        return toRemove.data;
    }

    public E peekTail() {
        if (head == null) {
            return null;
        }
        return tail.data;
    }

    public E peekHead() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node<E> temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }
}
