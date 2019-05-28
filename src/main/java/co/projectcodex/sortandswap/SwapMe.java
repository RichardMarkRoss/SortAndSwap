package co.projectcodex.sortandswap;

public class SwapMe {

    public static String[] swapFirstWithLast(String[] values) {
        String hold = values[values.length - 1];
        values[values.length - 1] = values[0];
        values[0] = hold;
        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {
        String hold = values[0];
        values[0] = values[1];
        values[1] = hold;
        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {
        for (int i = 0; i <= numbers.length; i++) {
            int hold = numbers[i];
            if (i == numbers.length - 1) {
                return numbers;
            }
            if (hold > numbers[i + 1]) {
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = hold;
            }
        }
        return numbers;

    }

    public static int[] bubbleLoopNumber(int[] numbers) {
        boolean loop = true;
        while (loop) {
            loop = false;
            for (int i = 0; i <= numbers.length; i++) {
                int hold = numbers[i];
                if (i == numbers.length - 1) {
                    break;
                }
                if (hold > numbers[i + 1]) {
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = hold;
                    loop = true;
                }

            }
        }
        return numbers;
    }

    public static int[] selectionSortNumber(int[] numbers) {

        for (int j = 0; j < numbers.length; j++) {
            int hold = numbers[j];
            int index = j;
            for (int i = j; i < numbers.length; i++) {
                if (hold > numbers[i]) {
                    hold = numbers[i];
                    index = i;
                }
            }
            int number = numbers[j];
            numbers[j] = numbers[index];
            numbers[index] = number;
        }
        return numbers;
    }
}
