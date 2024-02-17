package module06;

public class Methods {

    // DO NOT CHANGE THIS METHOD
    public static void main(String[] args) {
        double[] unsorted4 = { 92, 86, 100, 97 };
        double[] unsorted5 = { 92, 99, 86, 90, 80 };
        double[] sorted1 = { 93 };
        double[] sorted2 = { 93, 94 };
        double[] sorted4 = { 86, 92, 97, 100 };
        double[] sorted5 = { 80, 86, 90, 92, 99 };
        double[] sorted6 = { 80, 86, 90, 97, 98, 99 };
        double[] sorted7 = { 80, 86, 87, 91, 97, 98, 99 };
        int passed;

        passed = test("smallest of 4", smallest(unsorted4), 86) +
                test("smallest of 5", smallest(unsorted5), 80) +
                test("largest of 4", largest(unsorted4), 100) +
                test("largest of 5", largest(unsorted5), 99) +
                test("total of 4", total(unsorted4), 375) +
                test("total of 5", total(unsorted5), 447) +
                test("average of 4", average(unsorted4), 93.75) +
                test("average of 5", average(unsorted5), 89.4) +
                test("median of 1", median(sorted1), 93) +
                test("median of 2", median(sorted2), 93.5) +
                test("median of 4", median(sorted4), 94.5) +
                test("median of 5", median(sorted5), 90) +
                test("median of 6", median(sorted6), 93.5) +
                test("median of 7", median(sorted7), 91) +
                test("grade 100", grade(100), "A") +
                test("grade 90", grade(90), "A") +
                test("grade 85", grade(80), "B") +
                test("grade 80", grade(80), "B") +
                test("grade 70", grade(70), "C") +
                test("grade 60", grade(60), "D") +
                test("grade 50", grade(50), "F") +
                test("grade 110", grade(110), "Invalid Score") +
                test("grade 89.9", grade(89.9), "B") +
                test("grade -10", grade(-10), "Invalid Score");

        System.out.printf("%d out of 24 test passed\n", passed);
    }
/**
 * Find the smallest value in an array of doubles and return it.
 * 
 * @param numbers The array of doubles to search.
 * @return The smallest double found in the array.
 */
public static double smallest(double[] numbers) {
    int n = numbers.length;
    double result = numbers[0];

    for (int i = 1; i < n; i++) {
        if (numbers[i] < result) {
            result = numbers[i];
        }
    }

    return result;
}
    /**
 * Find the largest value in an array of doubles and return it.
 * 
 * @param numbers The array of doubles to search.
 * @return The largest double found in the array.
 */
public static double largest(double[] numbers) {
    int n = numbers.length;
    double result = numbers[0];

    for (int i = 1; i < n; i++) {
        if (numbers[i] > result) {
            result = numbers[i];
        }
    }

    return result;
}

    /**
 * Calculate the total sum of values in an array of doubles.
 * 
 * @param numbers The array of doubles.
 * @return The total sum of all the values in the array.
 */
public static double total(double[] numbers) {
    int n = numbers.length;
    double sum = 0;

    for (int i = 0; i < n; i++) {
        sum += numbers[i];
    }

    return sum;
}

    /**
 * Calculate the average of values in an array of doubles.
 * 
 * @param numbers The array of doubles.
 * @return The average of all the values in the array.
 */
public static double average(double[] numbers) {
    double sum = total(numbers);
    int n = numbers.length;

    return sum / n;
}

    /**
 * Calculate the median of values in an array of doubles.
 * 
 * @param numbers The sorted array of doubles.
 * @return The median value from the array.
 */
public static double median(double[] numbers) {
    int n = numbers.length;

    if (n % 2 != 0) {
        return numbers[n / 2];
    } else {
        return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
    }
}

    /**
 * Determine the grade based on the score provided.
 * 
 * @param score The score obtained.
 * @return The corresponding grade (A, B, C, D, or F).
 */
public static String grade(double score) {
    if (score > 100 || score < 0) {
        return "Invalid Score";
    } else if (score >= 90) {
        return "A";
    } else if (score >= 80) {
        return "B";
    } else if (score >= 70) {
        return "C";
    } else if (score >= 60) {
        return "D";
    } else {
        return "F";
    }
}
    /**
     * Check if the returned double matches the correct double and display a message
     * indicating if the values matched or not.
     * 
     * DO NOT CHANGE THIS METHOD.
     * 
     * @param name     The name of the method that was tested.
     * @param returned The value that was returned when the method was called.
     * @param correct  The correct value if this test passed.
     * @return 0 if returned does not match correct, 1 if they do match.
     */
    public static int test(String name, double returned, double correct) {
        int result;

        // For floating point math, == does not always work due to rouding errors. In
        // such instances, you can subtract the two values, take their absolute value,
        // and check if that is outside a tolerance value.
        if (Math.abs(returned - correct) > 0.001) {
            System.out.println("- " + name + " returned " + returned + " instead of " + correct);
            result = 0;
        } else {
            System.out.println("+ " + name + " returned " + returned + " correctly");
            result = 1;
        }

        return result;
    }

    /**
     * Check if the returned String matches the correct String and display a message
     * indicating if the values matched or not.
     * 
     * DO NOT CHANGE THIS METHOD.
     * 
     * @param name     The name of the method that was tested.
     * @param returned The value that was returned when the method was called.
     * @param correct  The correct value if this test passed.
     * @return 0 if returned does not match correct, 1 if they do match.
     */
    public static int test(String name, String returned, String correct) {
        int result;

        if (returned != correct) {
            System.out.printf("- %s returned %s instead of %s\n", name, returned, correct);
            result = 0;
        } else {
            System.out.printf("+ %s returned %s correctly\n", name, returned);
            result = 1;
        }

        return result;
    }
}