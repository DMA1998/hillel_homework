public class Arayz3 {

    private static final int DIGITS_AMOUNT = 10;

    public static void main(String[] args) {
        int[] array = {1, 5343, 2, 6332, 3, 789, 522,521,555};

        for (int arr : array)
            if (isNumber(arr))
                System.out.println(arr);
    }

    private static boolean isNumber(int x) {
        int[] numbers = new int[DIGITS_AMOUNT];
        int temp;
        while (x != 0) {
            temp = x % 10;
            if (numbers[temp] == 1)
                return false;
            numbers[temp]++;
            x /= 10;
        }
        return true;
    }

}



