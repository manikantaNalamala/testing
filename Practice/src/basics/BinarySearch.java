package basics;

public class BinarySearch {
    public static int searchList(int[] numbers, int targetNumber) {
        int minIndex = 0;
        int maxIndex = numbers.length - 1;

        while (minIndex <= maxIndex) {
            int middleIndex = (minIndex + maxIndex) / 2;
            if (targetNumber == numbers[middleIndex]) {
                return middleIndex;
            } else if (targetNumber > numbers[middleIndex]) {
                minIndex = middleIndex + 1;
            } else {
                maxIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int targetNumber = 4;
        int index = searchList(numbers, targetNumber);
        if (index != -1) {
            System.out.println("Target number found at index: " + index);
        } else {
            System.out.println("Target number not found.");
        }
    }
}
