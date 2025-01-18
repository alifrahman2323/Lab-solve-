import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = input.nextInt();
    ArrayOperation arrayOps = new ArrayOperation(size);

    System.out.println("Sum: " + arrayOps.calculateSum());
    System.out.println("Average: " + arrayOps.calculateAverage());
    System.out.println("Maximum: " + arrayOps.findMaximum());
    System.out.println("Minimum: " + arrayOps.findMinimum());
}
}
