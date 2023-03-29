public class Main
{
    public static void main(String[] args)
    {
        testStack();
        testQueue();
    }

    private static void testStack()
    {
        LinkedStack<String> stack = new LinkedStack<>();

        stack.push("Joe");
        stack.push("David");
        stack.push("Sarah");
        stack.push("Helen");
        stack.push("Mary");
        stack.push("Dylan");
        System.out.println("---------------");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("---------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        //System.out.println(stack.pop());
    }

    private static void testQueue()
    {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        //System.out.println(queue.dequeue());
    }
}
