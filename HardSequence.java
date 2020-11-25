public class HardSequence {

    public static void main(String[] args) {
        int n = 2;
        int arr[] = new int[129];
        int visited[] = new int[256];

        for(int i = 2; i < 129; i++){
            if(visited[arr[i-1]] > 0){
                arr[i] = (i-1) - visited[arr[i-1]];
            }
            else{
                arr[i] = 0;
            }
            visited[arr[i-1]] = (i-1);

        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(arr[n] == arr[i])
                count++;
        }
        System.out.println(count);

    }

}
