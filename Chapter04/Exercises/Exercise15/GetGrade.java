public class GetGrade {
    public static void main(String[] args) {
        double score = Double.parseDouble(args[0]);

        System.out.print(getGrade(score));
    }

    public static double getGrade(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException();
        }

        if (score < 60) {
            return 0;
        } else if (score < 62) {
            return 0.7;
        } else if (score < 95) {
            return score  * 0.1 - 5.5;
        } else {
            return 4.0;
        }
    }
}