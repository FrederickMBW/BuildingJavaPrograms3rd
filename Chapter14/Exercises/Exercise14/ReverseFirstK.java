import java.util.*;

public class ReverseFirstK {
    public static void reverseFirstK(int k, Queue<Integer> q) {
        // Check if n is too big
        if (q == null || k > q.size()) {
            throw new IllegalArgumentException();
        }

        // If k is less then 1. Do nothing
        if (k < 1) {
            return;
        }

        // Create aux storage stack
        Stack<Integer> s = new Stack<Integer>();

        // Move the first n elements to the stack
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // Move all the elements in the stack to the end of the q
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Move the n reversed elements to the front of the queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
    }
}