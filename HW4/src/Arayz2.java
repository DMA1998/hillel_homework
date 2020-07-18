public class Arayz2 {

    public static void main(String[] args) {

        int[] array = {221, 23, 321, 421421, 12, 4214, 12, 53443, 211, 26585, 231, 45};

        bubbleSort(array); // Arrays.sort(array)

        System.out.println("Самое короткое число массива: " + array[0] + " ,его длина равна "
                + countDigits(array[0]));
        System.out.println("Самое длинное число массива: " + array[array.length - 1] + " ,его длина равна "
                + countDigits(array[array.length - 1]));
    }

    private static int[] bubbleSort(int[] array) {

        int n = array.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }

    private static int countDigits(int number) {
        if (number < 0) {
            number *= -1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            ++count;
        }
        return count;
    }
}

