public class LeftArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rotate = 3;


        for(int i = 0; i < rotate ; i++){

            arr[i] = arr[i] + arr[i+rotate];
            arr[i+rotate] = arr[i] - arr[i+rotate];
            arr[i] = arr[i] - arr[i+rotate];
        }

        System.out.println(arr);
    }
}
