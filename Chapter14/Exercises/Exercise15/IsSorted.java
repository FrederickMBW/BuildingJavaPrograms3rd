import java.util.*;

public class IsSorted {
    public static boolean isSorted(Stack<Integer> s) {
        // Create an aux storage stack
        Stack<Integer> aux = new Stack<Integer>();

        // Throw exceptions
        if (s == null) {
            throw new NullPointerException();
        }

        if (s.size() <= 1) {
            return true;
        }

        // Determine if the stack is in sorted order
        boolean isStackSorted = true;

        int prev = s.pop();
        while(!s.isEmpty()) {
            int current = s.pop();
            
            if (current < prev) {
                isStackSorted = false;
            }

            aux.push(prev);
            prev = current;
        }
        aux.push(prev);

        // Restore the orignal stack
        while(!aux.isEmpty()) {
            s.push(aux.pop());
        }

        // Return if the stack is in sorted order
        return isStackSorted;
    }
}