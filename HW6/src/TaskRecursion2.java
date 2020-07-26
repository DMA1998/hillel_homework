public class TaskRecursion2 {

    public static void main(String[] args) {

        int numb = 775;
        int numbSum = recursion(numb);

        System.out.println(numbSum);


    }


    public static int recursion(int numb) {
        if (numb == 0) {
            return 0;
        }else{
            return (numb % 10 + recursion(numb / 10));

        }
    }



}
