// Tested on Practice it
// https://practiceit.cs.washington.edu/


// Returns the standard deviation for an array
public class Stdev {
    public static double stdev(int[] arr) {
        // Calculate the average
        double average = average(arr);

        // Calculate the numerator
        double numerator = numerator(arr, average);

        // Calculate the stdev and return it
        return Math.sqrt(numerator / (arr.length - 1));

    }

    // Calculate the numerator of the stdev equation
    public static double numerator(int[] arr, double average) {
        double numerator = 0;
        for (int i = 0; i < arr.length; i++) {
            numerator +=  Math.pow(arr[i] - average, 2);
        }
        return numerator;
    }

    // Calculates the average for an array of integers
    public static double average(int[] arr) {
        // Sum all the integers in the array
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate and return the average
        return sum / arr.length;
    }
}