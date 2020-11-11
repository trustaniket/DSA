public class MaximumNumber {


    public static void main(String[] args) {
        int number = 73483985;
        System.out.println(maxNumber(number));
    }

    static int maxNumber(int number){
        String num = String.valueOf(number);
        int[] arr = new int[10];
        StringBuilder output = new StringBuilder();
        for(int i = 0; i< num.length(); i++){
            if(arr[Integer.valueOf(num.substring(i, i+1))] == 0){
                arr[Integer.valueOf(num.substring(i, i+1))] = 1;
            }
            else{
                int temp = arr[Integer.valueOf(num.substring(i, i+1))];
                temp++;
                arr[Integer.valueOf(num.substring(i, i+1))] = temp;
            }
        }

        for(int i = arr.length; i > 0;i--){
            if(arr[i-1] > 0){
                int temp = arr[i-1];
                while(temp --> 0){
                    output.append(i-1);
                }
            }
        }
        return Integer.valueOf(output.toString());

    }
}
