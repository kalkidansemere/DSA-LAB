package Package1;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sequence of numbers (space-separated): ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        System.out.print("Enter a number to be searched: ");
        int searchNumber = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " is present in the array.");
            System.out.println("It appears " + count + " time(s).");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

    }
}
