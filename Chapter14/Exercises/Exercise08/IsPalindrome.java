import java.util.*;

public class IsPalindrome {
    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();

        // Add all the elements to the stack while keeping them in the q
        for (int i = 0; i < q.size(); i++) {
            int next = q.remove();
            s.push(next);
            q.add(next);
        }

        // Go through every element in the queue and check if it is in reverse order
        // If you find an element that makes the queue not a palindrome, record it.
        boolean isPalindrome = true;
        
        for (int i = 0; i < q.size(); i++) {
            if (q.peek() != s.peek()) {
                isPalindrome = false;
            }
            s.pop();
            q.add(q.remove());
        }

        return isPalindrome;
    }
}