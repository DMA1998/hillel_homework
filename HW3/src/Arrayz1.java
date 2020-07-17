public class Arrayz1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Четные числа массива:");

        for (int arr : array) {
            if (arr % 2 == 0) {
                System.out.print(arr + " ");
            }
        }

        System.out.println("\n\nНечетные числа массива: ");

        for (int arr1 : array) {
            if (arr1 % 2 - 1 == 0) {
                System.out.print(arr1 + " ");
            }
        }
    }
}

