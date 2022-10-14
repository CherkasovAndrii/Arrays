import java.util.Arrays;

public class task_3 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7};

        int[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        System.out.println(Arrays.toString(result));
    }

}
