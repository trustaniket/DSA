import java.io.IOException;
import java.util.Scanner;

public class BankManager{

public static void main(String[] args) throws IOException{
Scanner sc = new Scanner(System.in);

int t = sc.nextInt();

while(t --> 0){
int n = sc.nextLong();
int count = 0;
if(n == 1){
System.out.println(1);
continue;
}
else{
while(n % 2 == 0){
count += 2;
n /= 2;
}
for (int i = 3; i <= Math.sqrt(n); i=i+2){
while(n % i == 0){
count += i;
n /= i;
}
}
if (n > 2)
  count += n;

System.out.println(count);
continue;



}

}


}
  
}
