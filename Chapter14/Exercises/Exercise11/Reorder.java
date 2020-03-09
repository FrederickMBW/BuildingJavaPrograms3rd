import java.util.*;

public class Reorder {
    public static void reorder(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();

        // Get the size of the given q
        int size = q.size();

        // Go through the q and push all negative numbers to the stack
        // Keep all positive numbers in the queue
        for (int i = 0; i < size; i++) {
            int next = q.remove();
            if (next < 0) {
                s.push(next);
            } else {
                q.add(next);
            }
        }

        // Add all the negative numbers to the end of the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Put the negative numbers at the front of the queue
        for (int i = 0; i < size; i++) {
            if (q.peek() >= 0) {
                q.add(q.remove());
            } else {
                break;
            }
        }
    }
}