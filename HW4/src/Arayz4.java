public class Arayz4 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int i, j, k = 0;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                array[i][j] = k;
                k++;
            }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(array[i][j]);
            System.out.println();
        }
    }
}
