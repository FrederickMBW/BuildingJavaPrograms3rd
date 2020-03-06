import java.util.*;

public class ReverseHalf {
    public static void reverseHalf(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();

        // Remove all the odd indexes from the queue
        int size = q.size();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                q.add(q.remove());
            } else {
                s.push(q.remove());
            }
        }

        // Add the odd indexs back to the queue in reverse order
        while (!s.isEmpty()) {
            q.add(q.remove());
            q.add(s.pop());
        }

        // if the size is odd, put the front even number in the back of the queue
        if (size % 2 != 0) {
            q.add(q.remove());
        }
    }
}