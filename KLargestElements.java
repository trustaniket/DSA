import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {12,5,787,1,23};
        kLargestMinHeap(arr,2);
    }

    static void kLargestMinHeap(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i<k; i++){
            priorityQueue.add(arr[i]);
        }

        for(int i = k; i< arr.length; i++){
            if(arr[i] > priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        for(int i = 0; i < k; i++){
            System.out.println(priorityQueue.poll());
        }
    }
}
