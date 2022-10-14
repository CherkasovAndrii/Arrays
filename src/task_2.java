public class task_2 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 5, 6, 4, 10, 3};

        int temp = arr[arr.length - 1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i]= arr[i-1];
        }
        arr[0] = temp;

        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
