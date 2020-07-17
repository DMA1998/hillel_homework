public class Arrayz2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Простые числа массива: ");

        for (int arr : array) {
            if (arr > 1) {
                int count = 0;
                for (int i = 2; i <= arr; i++) {
                    if (arr % i == 0) {
                        ++count;
                    }
                }
                if (count < 2)
                    System.out.print(arr + " ");
            }
        }
    }
}




















