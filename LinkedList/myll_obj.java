public class myll_obj {
    public static void main(String[] args) {
        mylinkedlist<String> myll = new mylinkedlist<>();

        myll.print();

        myll.delAtPos(70);

        myll.delEnd();

        // myll.insertAtEnd(12);

        // myll.insertAtEnd(1);
        // myll.insertAtEnd(21);
        // myll.insertAtEnd(121);
        myll.insertAtEnd("hi");
        myll.insertAtEnd("hii");
        myll.insertAtEnd("bye");
        myll.print();

        // myll.insertAtStart(2);
        myll.insertAtStart("Gurpreet");

        myll.print();

        myll.insertAtPos("Guri", 2);
        myll.print();

        myll.delStart();
        myll.print();

        myll.delEnd();
        myll.print();

        System.out.println("hi");

        myll.delAtPos(2);
        myll.print();
        System.out.println(myll.getListSize());

        System.out.println("\nNew Testing\n");
        myll.insertAtPos("19bcs1961", 2);
        myll.print();
        System.out.println();

    }
}
