public class Vertical {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            vertical(args[i]);
        }
    }

    public static void vertical(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}