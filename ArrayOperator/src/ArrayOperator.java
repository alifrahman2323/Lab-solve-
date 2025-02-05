import java.util.Arrays;
import java.util.Scanner;

class ArrayOperations {
    private int[] arr;
    private int sum;
    private double average;
    private int maximum;
    private int minimum;

    public ArrayOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close(); // Close the scanner to prevent resource leaks

        calculateSum();
        calculateAverage();
        findMaximum();
        findMinimum();
    }

    private void calculateSum() {
        sum = Arrays.stream(arr).sum();
    }

    private void calculateAverage() {
        average = (double) sum / arr.length;
    }

    private void findMaximum() {
        maximum = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    private void findMinimum() {
        minimum = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}

