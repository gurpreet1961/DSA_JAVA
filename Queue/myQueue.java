
public class myQueue<E> {
    Node<E> head, rear;

    public void enqueue(E e) {
        Node<E> toAdd = new Node<E>(e);
        if (head == null) {
            head = rear = toAdd;

            return;
        }
        rear.next = toAdd;
        rear = rear.next;
    }

    public E dequeue() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        head = head.next;

        if (head == null) {
            rear = null;
        }
        return temp.data;

    }

    public void QueuePrint() {
        if (head == null) {
            System.out.println("queue is empty");
            return;
        }
        Node<E> temp = head;
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
