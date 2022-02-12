package codingTest;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int [] arr = new int[N + 1]; //

        for(int i =1; i<=N; i++){
            if(N % i == 0) {
                arr[i] = i;
            }
        }
        System.out.println(arr[K]);
    }

}
