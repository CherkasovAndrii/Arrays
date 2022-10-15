public class task_1 {
    /*
    * Визначити суму елементів цілочисленного масиву, розташованих між мінімальними та максимальними значеннями.
     Наприклад, є масив int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
*/
    public int min(int[] values){
        int min = values[0];
        int indexMin = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                indexMin = i;
            }
        }
        return indexMin;

    }
    public int max(int[] values){
        int max = values[0], indexMax = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i]>max){
                max = values[i];
                indexMax = i;
            }
        }

        return indexMax;
    }
    public int sumBetweenMaxAndMin(int[] values, int indexMin, int indexMax){
        int sum = 0;
        for (int i = indexMin + 1; i < indexMax; i++){
            sum += values[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        task_1 m = new task_1();
        System.out.println("Max index is " + m.max(values));
        System.out.println("Min index is " + m.min(values));
        System.out.println("Sum between minimum index and maximum index " + m.sumBetweenMaxAndMin(values, m.min(values), m.max(values)));

    }


}
