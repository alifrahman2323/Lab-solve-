import java.util.Scanner;

public class ArrayOperation {

    private int[] array;
    public ArrayOperation(int size){
        Scanner input = new Scanner(System.in);
        array = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }

    }
    public int calculateSum() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Calculates the average of array elements
    public double calculateAverage() {
        return (double) calculateSum() / array.length;
    }

    // Finds the maximum value in the array
    public int findMaximum() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public int findMinimum() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}