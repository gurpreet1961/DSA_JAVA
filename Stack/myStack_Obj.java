public class myStack_Obj {
    public static void main(String[] args) throws Exception {

        myStack<Integer> stack = new myStack<>();

        stack.push(5);
        stack.push(15);
        stack.push(52);
        stack.print();
        int popped = stack.pop();
        System.out.println(popped);
        stack.print();

        int peeked = stack.peek();
        System.out.println(peeked);
        stack.print();

    }
}
