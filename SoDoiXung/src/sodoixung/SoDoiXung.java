package sodoixung;

import java.util.Scanner;

public class SoDoiXung {

    static int size(long n){
        int i=10;
        int count=0;
        while(n>=1){
            n=(int)n/i;
            count++;
        }
        return count;
    }    
    
    static long reverse(long n){
        int size = size(n);
        long result=0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=(int) (n%10);
            n=n/10;
        }
        for(int i=0;i<size;i++){
            result+=array[size-1-i]*Math.pow(10, i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        if(n==reverse(n)) System.out.println("True");
        else System.out.println("False");
    }
    
}
