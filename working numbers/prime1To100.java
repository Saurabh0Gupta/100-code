//prime 1 to 100

import java.util.Scanner;

class prime1To100{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        for(int i=2; i<100; i++){
            if(isPrime(i)==1){
                System.out.print(i+" ");
            }   
        }
    }
    static int isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}