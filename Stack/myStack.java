public class myStack<E> {

    // Here I have Implemented stack using LinkedList

    // mylinkedlist<E> ll = new mylinkedlist<>();
    Node<E> head;

    void push(E e) {
        // ll.insertAtEnd(e);
        Node<E> toAdd = new Node<E>(e);
        if (head == null) {
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    E pop() throws Exception {
        // if (ll.isEmpty()) {
        // throw new Exception("Popping from empty Stack");
        // }
        // return ll.delEnd();
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("popping from empty stack");
        } else if (head.next == null) {
            Node<E> pop = head;

            head = null;
            return pop.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    E peek() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Peeking from empty Stack");
        }

        else if (temp.next == null) {
            return temp.data;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;

    }

    void print() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<E> {

        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

    }
}
