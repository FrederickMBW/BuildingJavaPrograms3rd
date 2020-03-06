import java.util.*;

public class Rearrange {
    public static void rearrange(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();

        // Remove all the odd numbers from the queue
        // and put them into a stack
        int size = q.size();

        // 1
        for (int i = 0; i < size; i++) {
            if (q.peek() % 2 != 0) {
                s.push(q.remove());
            } else {
                q.add(q.remove());
            }
        }

        // 2
        // Put the odd numbers back in the queue
        while(!s.isEmpty() && s.peek() % 2 != 0) {
            q.add(s.pop());
        }

        // 3
        // Put all the odd numbers back in the stack
        size = q.size();

        for (int i = 0; i < size; i++) {
            if (q.peek() % 2 == 0) {
                q.add(q.remove());
            } else {
                s.push(q.remove());
            }
        }

        // 4
        // Move all the odd numbers to the queue
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}