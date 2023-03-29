public class Main
{
    public static void main(String[] args)
    {
        Queue<Integer> nums = new Queue<>(5);

        System.out.println(nums);
        System.out.println("full? " + nums.isFull());
        nums.enqueue(10);
        System.out.println(nums);
        nums.enqueue(20);
        System.out.println(nums);
        nums.enqueue(30);
        System.out.println(nums);
        nums.enqueue(40);
        System.out.println(nums);
        nums.enqueue(50);
        System.out.println(nums);
        System.out.println("full? " + nums.isFull());
        //nums.push(60);

        System.out.println("----");

        System.out.println(nums);
        System.out.println("empty? " + nums.isEmpty());
        System.out.println(nums.dequeue());
        System.out.println(nums);
        System.out.println(nums.dequeue());
        System.out.println(nums);
        System.out.println(nums.dequeue());
        System.out.println(nums);
        System.out.println(nums.dequeue());
        System.out.println(nums);
        System.out.println(nums.dequeue());
        System.out.println(nums);
        System.out.println("empty? " + nums.isEmpty());
        //System.out.println(nums.pop());

//        Stack<String> nums = new Stack<>(5);
//
//        System.out.println(nums);
//        System.out.println("full? " + nums.isFull());
//        nums.push("Joe");
//        System.out.println(nums);
//        nums.push("Bob");
//        System.out.println(nums);
//        nums.push("Sarah");
//        System.out.println(nums);
//        nums.push("David");
//        System.out.println(nums);
//        nums.push("Jim");
//        System.out.println(nums);
//        System.out.println("full? " + nums.isFull());
//        //nums.push(60);
//
//        System.out.println("----");
//
//        System.out.println(nums);
//        System.out.println("empty? " + nums.isEmpty());
//        System.out.println(nums.pop());
//        System.out.println(nums);
//        System.out.println(nums.pop());
//        System.out.println(nums);
//        System.out.println(nums.pop());
//        System.out.println(nums);
//        System.out.println(nums.pop());
//        System.out.println(nums);
//        System.out.println(nums.pop());
//        System.out.println(nums);
//        System.out.println("empty? " + nums.isEmpty());
//        //System.out.println(nums.pop());
    }
}
