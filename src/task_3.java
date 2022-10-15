import java.util.Arrays;

public class task_3 {
/*Задано 2 масиви цілих чисел довільної довжини. Написати програму, що створює третій масив, що є злиттям 2-х заданих.
 */
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7};

        int[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        System.out.println(Arrays.toString(result));
    }

}
