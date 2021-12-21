public class DequeObj {
    public static void main(String[] args) {
        myDeque<Integer> mq = new myDeque<>();
        mq.addToHead(10);
        mq.addToHead(13);
        mq.addToHead(14);
        mq.print();
        mq.removeToTail();
        mq.print();

        mq.addToTail(40);
        mq.print();

        mq.removeToHead();
        mq.print();

        mq.addToHead(30);
        mq.addToHead(43);
        mq.addToHead(154);
        mq.print();

        System.out.println(mq.peekTail());
        System.out.println(mq.peekHead());

    }
}
