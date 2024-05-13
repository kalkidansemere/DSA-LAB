package Package6;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        int[] modifiedArray = deleteElement(array, indexToDelete);

        if (modifiedArray != null) {
            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] modifiedArray = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                modifiedArray[j] = array[i];
                j++;
            }
        }

        return modifiedArray;
    }
}