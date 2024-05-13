package Package5;
import java.util.Scanner;

public class MergeSort {
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

        public static void mergeSort(int[] array) {
            if (array.length <= 1) {
                return;
            }

            int mid = array.length / 2;


            int[] left = new int[mid];
            int[] right = new int[array.length - mid];


            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, mid, right, 0, right.length);


            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }

        private static void merge(int[] array, int[] left, int[] right) {
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }


            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }


            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }


        public static void printArray(int[] searchNumber) {
            for (int i = 0; i < searchNumber.length; i++) {
                System.out.print(searchNumber[i] + " ");
            }
            System.out.println();
            System.out.println("Array before sorting:");
            printArray(searchNumber);

            System.out.println("Array after sorting:");

            mergeSort(searchNumber);
        }
    }




