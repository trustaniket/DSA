import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Good Number
PrepBuddy gives you a positive integer number. You have to find the smallest good number greater than or equal to the given number.
The positive integer is called good if it can be represented as a sum of distinct powers of 3 (i.e. no duplicates of powers of 3 are allowed).
For example:
1. 
84
 is a good number: 
84
=
3
4
+
3
1
,
2. 
1
 is a good number: 
1
=
3
0
,
3. 
13
 is a good number: 
13
=
3
2
+
3
1
+
3
0
,
4. but 
2
 is not a good number: you can't represent it as a sum of distinct powers of 
3
 (
2
=
3
0
+
3
0
 is invalid),
5. 
20
 is not a good number: you can't represent it as a sum of distinct powers of 
3
 (for example, the representations 
20
=
3
2
+
3
2
+
3
0
+
3
0
 is invalid),
Note, that there exist other representations of 
20
 as sums of powers of 
3
 but none of them consists of distinct powers of 
3
.

Input Format
The first line of the input contains one integer 
T
 — the number of test cases.
Each test case contains one integer 
N
.

Output Format
For each test case, print the smallest integer that is a good number.

Constraints
1
≤
T
≤
500

1
≤
N
≤
10
18

Example
Input
5
3
46
65
89
113

Output
3
81
81
90
117
*/
public class GoodNumber {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t --> 0){
            long n = sc.nextLong();
            if(n < 0)
                continue;
            List<Long> list = new ArrayList<>();
            long power = 0;

            long t2 = 0;
            while(true){
                list.add(power);
                long temp = 1;
                long k = power;
                while( k --> 0){
                    temp *= 3;
                }
                t2 += temp;
                if(temp > n){
                    break;
                }

                power++;
            }

            for(int i = list.size() -1; i >= 0; i--){
                long temp = 1;
                int k = i;
                while( k --> 0){
                    temp *= 3;
                }

                if((t2 - temp) < n){

                    continue;
                }
                else{

                    list.set(i, 0L);
                    t2 = t2 - temp;
                    //System.out.println(n - temp);
                }
            }

            System.out.println(t2);
            continue;

        }

    }
}
