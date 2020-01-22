public class PadString {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            System.out.println(padString(args[i], Integer.parseInt(args[i + 1])));
        }
    }

    public static String padString(String s, int pad) {
        String result = s;
        for (int i = 0; i < pad - s.length(); i++) {
            result += "-";
        }
        return result;
    }
}