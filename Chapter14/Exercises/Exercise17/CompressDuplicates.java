import java.util.*;

public class CompressDuplicates {
    public static void compressDuplicates(Stack<Integer> s) {
        // Throw exceptions for illegal arguments
        if (s == null) {
            throw new IllegalArgumentException();
        }

        // Deal with empty stack
        // Do nothing
        if (s.size() == 0) {
            return;
        }

        // Create a Queue for aux storage
        Queue<Integer> q = new LinkedList<Integer>();

        // Put every element in the queue in the original order
        stackToQueue(s, q);
        queueToStack(q, s);
        stackToQueue(s, q);

        // Count the number of duplicates in a row of each int in the queue
        // Push the number of duplicates followed by the duplicate number back into the stack
        int count = 1;
        int prev = q.remove();

        while (!q.isEmpty()) {
            int current = q.remove();

            if (current == prev) {
                count++;
            } else {
                s.push(count);
                s.push(prev);
                count = 1;
            }

            prev = current;
        }

        s.push(count);
        s.push(prev);
    }

    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void queueToStack (Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}