public class IndexOf {
    public static void main(String[] args) {
        String s = args[0];
        String sub = args[1];

        System.out.println(indexOf(s, sub));
    }

    public static int indexOf(String s, String sub) {
        return indexOf(s, sub, 0);
    }

    private static int indexOf(String s, String sub, int index) {
        if (sub.length() + index > s.length()) {
            return -1;
        }

        for (int i = 0; i < sub.length(); i++) {
            if (s.charAt(index + i) != sub.charAt(i)) {
                return indexOf(s, sub, index + 1);
            }
        }

        return index;
    }
}