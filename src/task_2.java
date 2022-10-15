public class task_2 {
    /*
    * Напишіть програму, яка циклічно зсуває елементи масиву вправо на одну позицію та друкує результат.
    * Циклічність означає, що останній елемент масиву стає найпершим його елементом.
     */
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 5, 6, 4, 10, 3};

        int temp = arr[arr.length - 1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i]= arr[i-1];
        }
        arr[0] = temp;


        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
