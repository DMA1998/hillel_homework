public class Arayz1 {
    public static void main(String[] args) {
        int[] bigArray = {0, 2, 4, 6, 3, -1, 1};
        int[] smallArray = {4, 6, 3};
        boolean isSubsequence = true;
        for (int small : smallArray) {
            boolean isContains = false;
            for (int big : bigArray) {
                if (small == big) {
                    isContains = true;
                    break;
                }
            }
            if (!isContains) {
                isSubsequence = false;
                break;
            }
        }
        System.out.println(isSubsequence);
    }
}

