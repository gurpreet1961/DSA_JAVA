public class mylinkedlist<E> {
    Node<E> Head;

    public boolean isEmpty() {
        return Head == null;
    }

    int getListSize() {
        int size = 0;
        Node<E> temp = Head;
        if (!isEmpty()) {
            while (temp != null) {
                size++;
                temp = temp.next;
            }
        }
        return size;
    }

    public void insertAtEnd(E data) {
        Node<E> toAdd = new Node<E>(data);
        if (isEmpty()) {
            Head = toAdd;
            return;
        }
        Node<E> temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    void insertAtStart(E data) {
        Node<E> toAdd = new Node<E>(data);
        toAdd.next = Head;
        Head = toAdd;

    }

    void insertAtPos(E data, int index) {
        if (index == 0) {
            insertAtStart(data);
            return;
        } else if (index == getListSize() - 1) {
            insertAtEnd(data);
            return;

        } else if (index > 1 && index <= getListSize()) {
            Node<E> toAdd = new Node<E>(data);

            Node<E> temp = Head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            toAdd.next = temp.next;
            temp.next = toAdd;
            return;

        } else {
            System.out.println("Inssrtion not possible at postion " + index);
            return;

        }

    }

    void delStart() {
        if (isEmpty()) {
            System.out.println("NullPointerException!");
            return;
        }
        Head = Head.next;
    }

    public E delEnd() {

        if (isEmpty()) {
            System.out.println("NullPointerException!");
            return ("NullPointerException!");
        } else if (getListSize() == 1) {
            Node<E> toRemove = Head;
            Head = null;
            return toRemove.data;
        }
        Node<E> temp = Head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    void delAtPos(int index) {
        if (isEmpty()) {
            System.out.println("NullPointerException!");
            return;
        } else if (getListSize() < index) {
            System.out.println("IndexOutOfBoundException!");
            return;
        } else if (index == 0) {
            delStart();
            return;
        } else if (index == getListSize() - 1) {
            delEnd();
            return;
        }

        Node<E> temp = Head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // temp.next=

    }

    public E getLast() throws Exception {

        if (isEmpty()) {
            throw new Exception("Cannot peek in Emmpty list");
        } else if (getListSize() == 1) {
            return Head.data;
        }
        Node<E> temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node<E> temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
}
