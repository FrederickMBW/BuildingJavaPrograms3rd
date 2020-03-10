import java.util.*;

public class RemoveMin {
    public static int removeMin(Stack<Integer> s) {
        // Throw exceptions
        if (s == null || s.size() == 0) {
            throw new IllegalArgumentException();
        }

        // Create queue as aux storage
        Queue<Integer> q = new LinkedList<Integer>();

        // Move all elements to the queue
        stackToQueue(s, q);

        // Find the minimum value
        int min = findMin(q);

        // Remove all integers equal to the smallest integer from the queue
        removeValue(q, min);

        // Put all the elements remaining back into the stack
        // in the original order
        queueToStack(q, s);
        stackToQueue(s, q);
        queueToStack(q, s);

        // Return the min value
        return min;
    }

    // Removes the value 
    private static void removeValue(Queue<Integer> q, int value) {
        // Throw exceptions
        if (q == null) {
            throw new IllegalArgumentException();
        }

        // Remove the value from the queue
        int size = q.size();
        
        for (int i = 0; i < size; i++) {
            if (q.peek() != value) {
                q.add(q.remove());
            } else {
                q.remove();
            }
        }
    }

    // Returns the min value in an queue
    private static int findMin(Queue<Integer> q) {
        // Throw exceptions
        if (q == null || q.size() == 0) {
            throw new IllegalArgumentException();
        }

        int min = q.peek();

        for (int i = 0; i < q.size(); i++) {
            if (q.peek() < min) {
                min = q.peek();
            }
            q.add(q.remove());
        }

        return min;
    }

    private static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    private static void queueToStack (Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}