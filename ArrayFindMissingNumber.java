import java.util.Scanner;

public class ArrayFindMissingNumber {

    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            long n = sc.nextLong();
            long total = n*(n+1)/2;
            long temp = n-1;
            while(temp --> 0)
                total -= sc.nextLong();
            System.out.println(total);
        }



    }
}
