package codingTest;

import java.util.Scanner;

public class binaryNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++) {
            int Bi=sc.nextInt();
            String Bin=Integer.toBinaryString(Bi); //이진수로 변환
            for(int j = Bin.length()-1; j>=0;j--) {
                if(Bin.charAt(j)=='1') {
                    System.out.print(Bin.length()-j-1+" ");
                }
            }
            System.out.println();
        }
    }
}


