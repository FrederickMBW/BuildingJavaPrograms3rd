import java.util.*;

public class Equals {
    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        // Determine results for null parameteres
        if (s1 == null && s2 == null) {
            return true;
        } else if (s1 == null || s2 == null) {
            return false;
        }

        // Return false if not the same size
        if (s1.size() != s2.size()) {
            return false;
        }

        // Create a stack for auxiliary storage
        Stack<Integer> storage = new Stack<Integer>();

        // Check if the stacks are equal
        while (!s1.isEmpty()) {
            if (s1.peek() == s2.peek()) {
                storage.push(s1.pop());
                storage.push(s2.pop());
            } else {
                break;
            }
        }

        // If s1 isn't empty, the two stacks are not equal
        if (!s1.isEmpty()) {
            while (!storage.isEmpty()) {
                s1.push(storage.pop());
                s2.push(storage.pop());
            }
            return false;
        }

        // Put all the elements back into the original stack
        while (!storage.isEmpty()) {
            s1.push(storage.pop());
            s2.push(storage.pop());
        }

        // Got this far? the stacks are equal
        return true;
    }
}