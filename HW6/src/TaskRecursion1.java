public class TaskRecursion1 {

    static int count = 0;

    public static void main(String[] args) {
        recursion(5);
    }

    public static void recursion(int number) {

        if (++count <= number) {
            System.out.print(count + " ");
            recursion(number);
        }
    }

}









