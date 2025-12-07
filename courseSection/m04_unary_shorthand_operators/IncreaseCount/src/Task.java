public class Task {
    public static void main(String[] args) {
        int count = 5;
        //Do not change below line: needed for testing---
        count = args.length > 0 ? Integer.parseInt(args[0]) : count;

        // Write your solution here
        count = count + 1;  // arithmetic operator
        count++;            // unary increment operator
        count += 1;         // shorthand operator

        System.out.println("count = " + count);
    }
}