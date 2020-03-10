import java.util.*;

public class MirrorHalves {
    public static void mirrorHalves(Queue<Integer> q) {
        // Throw exceptions
        if (q == null || q.size() % 2 != 0) {
            throw new IllegalArgumentException();
        }

        // Deal with an empty Queue
        // Do nothing
        if (q.size() == 0) {
            return;
        }

        // Create a stack for aux storage
        Stack<Integer> s = new Stack<Integer>();

        // Mirror the first half of the queue
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            s.add(q.peek());
            q.add(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Mirror the second half of the queue
        for (int i = 0; i < size / 2; i++) {
            s.add(q.peek());
            q.add(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}