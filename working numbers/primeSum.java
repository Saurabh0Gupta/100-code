//14=3+11
//14=7+7

import java.util.Scanner;

class primeSum{
    public static void main(String er[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2; i<=num/2; i++){
            if(isPrime(i)==1){
                if(isPrime(num-i)==1){
                    System.out.println(i+"+"+(num-i)+"="+(i+(num-i)));
                }
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