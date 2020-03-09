import java.util.*;

public class Expunge {
    public static void expunge(Stack<Integer> s) {
        // Don't do anything to a null or empty stack
        if (s == null || s.size() == 0) {
            return;
        }

        // Create a stack for aux storage
        Stack<Integer> aux = new Stack<Integer>();

        // Move all elements to the aux stack
        // while removing any elements smaller than the largest element previously added
        aux.push(s.pop());
        while (!s.isEmpty()) {
            if (s.peek() >= aux.peek()) {
                aux.push(s.pop());
            } else {
                s.pop();
            }
        }

        // Put all the elements back in the original stack
        stackToStack(aux, s);
    }

    public static void stackToStack(Stack<Integer> s1, Stack<Integer> s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }
}