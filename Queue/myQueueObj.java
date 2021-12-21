public class myQueueObj {
    public static void main(String[] args) {
        myQueue<Integer> mq = new myQueue<>();
        mq.QueuePrint();
        mq.enqueue(1);
        mq.enqueue(11);
        mq.enqueue(21);
        mq.enqueue(31);
        mq.enqueue(14);
        mq.QueuePrint();

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        mq.enqueue(1);
        mq.enqueue(11);
        mq.enqueue(21);
        mq.enqueue(31);
        mq.enqueue(14);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

    }
}
