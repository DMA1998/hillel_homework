public class Arrayz4 {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 3, 10, 2, 11, 5, 6, 7};
        System.out.println("Наибольшее число массива: " + maxValueOfArray(array));
        System.out.println("Наименьшее число массива: " + minValueOfArray(array));

    }

    public static int maxValueOfArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }

    public static int minValueOfArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[array.length - 1];

    }

}